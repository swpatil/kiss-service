package com.tdc.authentication;

import java.io.IOException;
import java.util.Map;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jcifs.Config;
import jcifs.UniAddress;
import jcifs.http.NtlmSsp;
import jcifs.smb.NtlmChallenge;
import jcifs.smb.NtlmPasswordAuthentication;
import jcifs.smb.SmbAuthException;
import jcifs.smb.SmbSession;
import jcifs.util.Base64;
import jcifs.util.Hexdump;
import jcifs.util.LogStream;

import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.authentication.AuthenticationDetailsSource;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.util.Assert;
import org.springframework.web.filter.GenericFilterBean;

public class NtlmAuthenticationFilter extends GenericFilterBean {
	private AuthenticationDetailsSource authenticationDetailsSource;
	private AuthenticationManager authenticationManager;
	private String credentialsCharset;
	private String environment;
	private String proxy;

	private String defaultDomain;
	private String domainController;
	private boolean loadBalance;
	private boolean enableBasic;
	private boolean insecureBasic;
	private String realm;

	public NtlmAuthenticationFilter() {
		this.authenticationDetailsSource = new WebAuthenticationDetailsSource();
		this.credentialsCharset = "UTF-8";
	}

	public void afterPropertiesSet() {
		Assert.notNull(this.authenticationManager, "An AuthenticationManager is required");
	}

	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) req;
		HttpServletResponse response = (HttpServletResponse) res;

		NtlmPasswordAuthentication ntlm;
		
		if ((ntlm = negotiate(request, response, false)) == null) {
			return;
		}

		request = new NtlmHttpServletRequest(request, ntlm);

		if (ntlm != null) {
			if (authenticationIsRequired(ntlm.getUsername())) {
				logger.debug("Basic Authentication Authorization header found for user '" + ntlm.getUsername() + "'");
				UsernamePasswordAuthenticationToken authRequest = new UsernamePasswordAuthenticationToken(ntlm.getUsername(), "dummypwd");
				authRequest.setDetails(this.authenticationDetailsSource.buildDetails(request));
				Authentication authResult;
				try {
					authResult = this.authenticationManager.authenticate(authRequest);
				} catch (AuthenticationException failed) {
					logger.debug("Authentication request for user: " + ntlm.getUsername() + " failed: " + failed.toString(), failed);
	
					SecurityContextHolder.getContext().setAuthentication(null);
					onUnsuccessfulAuthentication(request, response, failed);
	
					if (!response.isCommitted()) {
						((HttpServletResponse) response).sendError(HttpServletResponse.SC_FORBIDDEN, failed.getMessage());
					}
	
					return;
				}
	
				logger.debug("Authentication success: " + authResult.toString());
	
				SecurityContextHolder.getContext().setAuthentication(authResult);


			}
			
			if (SecurityContextHolder.getContext().getAuthentication() != null)
				response.addHeader("x-k2ui-roles", SecurityContextHolder.getContext().getAuthentication().getAuthorities().toString());
			
			response.addHeader("x-k2ui-userid", stripDomain(ntlm.getName()));
			response.setStatus(200);
			//response.addHeader("x-k2ui-environment", environment);
			//response.addHeader("x-k2ui-proxy", proxy);

		}

		chain.doFilter(request, response);
	}

	private String stripDomain(String ntlmUser) {
		if (ntlmUser != null) {
			String[] split = ntlmUser.split("\\\\");
			if (split.length == 1) 
				return split[0];
			else
				return split[1];
		}
		
		return "";
	}
	
	private boolean authenticationIsRequired(String username) {
		Authentication existingAuth = SecurityContextHolder.getContext().getAuthentication();

		if ((existingAuth == null) || (!(existingAuth.isAuthenticated()))) {
			return true;
		}

		if ((existingAuth instanceof UsernamePasswordAuthenticationToken) && (!(existingAuth.getName().equals(username)))) {
			return true;
		}

		return (existingAuth instanceof AnonymousAuthenticationToken);
	}

	private static LogStream log = LogStream.getInstance();

	public void setJcifsConfig(Map<String, String> map) {
		Config.setProperty("jcifs.smb.client.soTimeout", "1800000");
		Config.setProperty("jcifs.netbios.cachePolicy", "1200");
		Config.setProperty("jcifs.smb.lmCompatibility", "0");
		Config.setProperty("jcifs.smb.client.useExtendedSecurity", "false");

		for (Map.Entry<String, String> entry : map.entrySet()) {
			Config.setProperty(entry.getKey(), entry.getValue());
		}

		this.defaultDomain = Config.getProperty("jcifs.smb.client.domain");
		this.domainController = Config.getProperty("jcifs.http.domainController");
		if (this.domainController == null) {
			this.domainController = this.defaultDomain;
			this.loadBalance = Config.getBoolean("jcifs.http.loadBalance", true);
		}
		this.enableBasic = Boolean.valueOf(Config.getProperty("jcifs.http.enableBasic")).booleanValue();

		this.insecureBasic = Boolean.valueOf(Config.getProperty("jcifs.http.insecureBasic")).booleanValue();

		this.realm = Config.getProperty("jcifs.http.basicRealm");
		if (this.realm == null)
			this.realm = "jCIFS";
		int level;
		if ((level = Config.getInt("jcifs.util.loglevel", -1)) != -1) {
			LogStream.setLevel(level);
		}
		if (LogStream.level <= 2)
			return;
		try {
			Config.store(log, "JCIFS PROPERTIES");
		} catch (IOException ioe) {
		}
	}

	protected NtlmPasswordAuthentication negotiate(HttpServletRequest req, HttpServletResponse resp, boolean skipAuthentication) throws IOException, ServletException {
		NtlmPasswordAuthentication ntlm = null;
		String msg = req.getHeader("Authorization");
		boolean offerBasic = (this.enableBasic) && (((this.insecureBasic) || (req.isSecure())));

		if ((msg != null) && (((msg.startsWith("NTLM ")) || ((offerBasic) && (msg.startsWith("Basic ")))))) {
			UniAddress dc;
			if (msg.startsWith("NTLM ")) {
				HttpSession ssn = req.getSession();
				byte[] challenge;
				if (this.loadBalance) {
					NtlmChallenge chal = (NtlmChallenge) ssn.getAttribute("NtlmHttpChal");
					if (chal == null) {
						chal = SmbSession.getChallengeForDomain();
						ssn.setAttribute("NtlmHttpChal", chal);
					}
					dc = chal.dc;
					challenge = chal.challenge;
				} else {
					dc = UniAddress.getByName(this.domainController, true);
					challenge = SmbSession.getChallenge(dc);
				}

				if ((ntlm = NtlmSsp.authenticate(req, resp, challenge)) == null) {
					return null;
				}

				ssn.removeAttribute("NtlmHttpChal");
			} else {
				String auth = new String(Base64.decode(msg.substring(6)), "US-ASCII");

				int index = auth.indexOf(58);
				String user = (index != -1) ? auth.substring(0, index) : auth;
				String password = (index != -1) ? auth.substring(index + 1) : "";

				index = user.indexOf(92);
				if (index == -1)
					index = user.indexOf(47);
				String domain = (index != -1) ? user.substring(0, index) : this.defaultDomain;

				user = (index != -1) ? user.substring(index + 1) : user;
				ntlm = new NtlmPasswordAuthentication(domain, user, password);
				dc = UniAddress.getByName(this.domainController, true);
			}
			try {
				SmbSession.logon(dc, ntlm);

				if (LogStream.level > 2)
					log.println("NtlmHttpFilter: " + ntlm + " successfully authenticated against " + dc);
				
			} catch (SmbAuthException sae) {
				if (LogStream.level > 1) {
					log.println("NtlmHttpFilter: " + ntlm.getName() + ": 0x" + Hexdump.toHexString(sae.getNtStatus(), 8) + ": " + sae);
				}

				if (sae.getNtStatus() == -1073741819) {
					HttpSession ssn = req.getSession(false);
					if (ssn != null) {
						ssn.removeAttribute("NtlmHttpAuth");
					}
				}
				resp.setHeader("WWW-Authenticate", "NTLM");
				if (offerBasic) {
					resp.addHeader("WWW-Authenticate", "Basic realm=\"" + this.realm + "\"");
				}

				resp.setStatus(401);
				resp.setContentLength(0);
				resp.flushBuffer();
				return null;
			}
			
			req.getSession().setAttribute("NtlmHttpAuth", ntlm);
			
			
		} else if (!(skipAuthentication)) {
			HttpSession ssn = req.getSession(false);
			if ((ssn == null) || ((ntlm = (NtlmPasswordAuthentication) ssn.getAttribute("NtlmHttpAuth")) == null)) {
				resp.setHeader("WWW-Authenticate", "NTLM");
				if (offerBasic) {
					resp.addHeader("WWW-Authenticate", "Basic realm=\"" + this.realm + "\"");
				}

				resp.setStatus(401);
				resp.setContentLength(0);
				resp.flushBuffer();
				return null;
			}

		}

		return ntlm;
	}

	protected void onUnsuccessfulAuthentication(HttpServletRequest request, HttpServletResponse response, AuthenticationException failed) throws IOException {
	}

	protected AuthenticationManager getAuthenticationManager() {
		return this.authenticationManager;
	}

	public void setAuthenticationManager(AuthenticationManager authenticationManager) {
		this.authenticationManager = authenticationManager;
	}

	public void setCredentialsCharset(String credentialsCharset) {
		Assert.hasText(credentialsCharset, "credentialsCharset cannot be null or empty");
		this.credentialsCharset = credentialsCharset;
	}

	protected String getCredentialsCharset(HttpServletRequest httpRequest) {
		return this.credentialsCharset;
	}
	
	public void setEnvironment(String environment) {
		this.environment = environment;
	}

	public void setProxy(String proxy) {
		this.proxy = proxy;
	}

}

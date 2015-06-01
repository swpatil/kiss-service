package com.tdc.authentication;

import javax.naming.NameNotFoundException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.ldap.core.DirContextOperations;
import org.springframework.ldap.core.support.BaseLdapPathContextSource;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.ldap.SpringSecurityLdapTemplate;
import org.springframework.security.ldap.authentication.AbstractLdapAuthenticator;
import org.springframework.security.ldap.authentication.PasswordComparisonAuthenticator;
import org.springframework.util.Assert;

public final class NtlmLdapAuthenticator extends AbstractLdapAuthenticator {
	private static final Log logger = LogFactory.getLog(PasswordComparisonAuthenticator.class);

	private String passwordAttributeName = "userPassword";

	public NtlmLdapAuthenticator(BaseLdapPathContextSource contextSource) {
		super(contextSource);
	}

	public DirContextOperations authenticate(Authentication authentication) {
		Assert.isInstanceOf(UsernamePasswordAuthenticationToken.class, authentication, "Can only process UsernamePasswordAuthenticationToken objects");

		DirContextOperations user = null;
		String username = authentication.getName();

		SpringSecurityLdapTemplate ldapTemplate = new SpringSecurityLdapTemplate(getContextSource());

		for (String userDn : getUserDns(username)) {
			user = ldapTemplate.retrieveEntry(userDn, getUserAttributes());
			if (user != null) {
				break;
			}
		}

		if ((user == null) && (getUserSearch() != null)) {
			user = getUserSearch().searchForUser(username);
		}

		if (user == null) {
			throw new UsernameNotFoundException("User not found: " + username);
		}

		if (logger.isDebugEnabled()) {
			logger.debug("Performing LDAP compare of password attribute '" + this.passwordAttributeName + "' for user '" + user.getDn() + "'");
		}

		return user;
	}

	public void setPasswordAttributeName(String passwordAttribute) {
		Assert.hasLength(passwordAttribute, "passwordAttributeName must not be empty or null");
		this.passwordAttributeName = passwordAttribute;
	}

}

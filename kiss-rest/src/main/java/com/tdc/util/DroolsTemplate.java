package com.tdc.util;

import java.nio.charset.Charset;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class DroolsTemplate {

	@Autowired
	private RestTemplate restTemplate;
	private HttpHeaders headers=null;
	private HttpEntity<DroolsAuthorizationRequest> httpEntity=null;




	public void prepareDroolsRequest(DroolsAuthorizationRequest droolsAuthorizationRequest ){
		headers= new HttpHeaders();
		headers.setAccept(Arrays.asList(new MediaType("application", "json", Charset.forName("ISO-8859-1"))));
		headers.setContentType(new MediaType("application", "json", Charset.forName("ISO-8859-1")));
		httpEntity = new HttpEntity<DroolsAuthorizationRequest>(droolsAuthorizationRequest,headers);

	}

	public DroolsAuthorizationReply getAuthorizeFields(){
		String url = "http://localhost:8080/drools/service/droolsauthservice/authorizefields";
		try {
			ResponseEntity<DroolsAuthorizationReply> result = restTemplate.exchange(url,HttpMethod.POST, httpEntity, DroolsAuthorizationReply.class);
			DroolsAuthorizationReply reply=result.getBody();
			System.out.println(result.getBody().getResultSO().getEditableFields());
			return reply;
		} catch (Exception e) {
			return null;
		}
	}
}

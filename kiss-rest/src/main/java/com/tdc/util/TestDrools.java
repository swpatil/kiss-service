package com.tdc.util;

import java.nio.charset.Charset;
import java.util.Arrays;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class TestDrools {


	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {

		
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(new MediaType("application", "json", Charset.forName("ISO-8859-1"))));
		headers.setContentType(new MediaType("application", "json", Charset.forName("ISO-8859-1")));
	


		DroolsAuthorizationRequest req= new DroolsAuthorizationRequest();
		req.setScreenId("screen");
		HttpEntity entity = new HttpEntity(req,headers);
		
		String url = "http://localhost:8080/drools/service/droolsauthservice/authorizefieldsss";
		try {
			ResponseEntity<DroolsAuthorizationReply> result = restTemplate.exchange(url,
					HttpMethod.POST, entity, DroolsAuthorizationReply.class);
			
			DroolsAuthorizationReply reply=result.getBody();
			System.out.println(result.getBody().getResultSO().getEditableFields());

		} catch (Exception e) {
			String str = "sdfsdf";
			e.printStackTrace();
			System.out.println("catched1");
		}

	}

}

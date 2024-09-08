package com.subha.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.subha.binding.Request;
import com.subha.binding.Response;

@Service
public class MMTServiceImpl implements MMTService{
	@Value("${apiUrl}")
	private String url;
	
	@Value("${apiUrl2}")
	private String url2;
	
	RestTemplate rt=new RestTemplate();
	
	public Response bookTicket(Request req) {
		ResponseEntity<Response> entity = rt.postForEntity(url, req, Response.class);
	       Response response = entity.getBody();
		   return response;
	}
	
	public List<Response> getAllTickets(){
		ResponseEntity<Response[]> entity = rt.getForEntity(url2, Response[].class);
		Response[] responses = entity.getBody();
		return Arrays.asList(responses);
	}
	

}

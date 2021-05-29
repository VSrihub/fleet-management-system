package com.fleet.management;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.cloud.netflix.zuul.ZuulServletFilter;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class TokenFilter extends ZuulServletFilter {

	private static final String TOKEN_URL = "http://localhost:8080/auth/token";
	private static final String TOKEN_HEADER_NAME = "Authorization";
	private static final String TOKEN_HEADER_PREFIX="Bearer ";
	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest)servletRequest;
		String headerVal = req.getHeader(TOKEN_HEADER_NAME);
		System.out.println("****header val is:\t"+headerVal);
		if(headerVal != null && !headerVal.isEmpty()) {
			if(headerVal.startsWith(TOKEN_HEADER_PREFIX)) {
				//headerVal = headerVal.replace(TOKEN_HEADER_PREFIX, "");
				
				Map<String,String> headrsMap = new HashMap<String,String>();
				headrsMap.put(TOKEN_HEADER_NAME, headerVal);
				
				HttpEntity headers = new HttpEntity(headrsMap);
				
				
				
				RestTemplate rt = new RestTemplate();
				ResponseEntity<String> resp = rt.exchange(
						TOKEN_URL, HttpMethod.GET, headers,
						String.class);
				//ResponseEntity<String> resp = rt.getForEntity(TOKEN_URL, String.class, headrsMap);
				System.out.println(resp.getStatusCodeValue());
				
				
				//Logic to contact the JWT Authentication Service
				//validate the token
				//if the token is valid, then forward the request
			}
			super.doFilter(servletRequest, servletResponse, filterChain);
		}else {
			HttpServletResponse resp = (HttpServletResponse)servletResponse;
			resp.sendError(HttpStatus.FORBIDDEN.value());
		}
		
		super.doFilter(servletRequest, servletResponse, filterChain);
	}
	
	public static void main(String[] args) {
		String headerVal = "Bearer eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZG1pbiIsInJvbGVzIjpbXSwiaWF0IjoxNjIxNzQ0MzQ2LCJleHAiOjE2MjE4MzA3NDZ9.oiFW5Zk0Gbt98p61kBKb6eeOjS6iKs2n4bXbZ_f_so8";
		HttpHeaders headrsMap = new HttpHeaders();
		//Map<String,String> headrsMap = new HashMap<String,String>();
		headrsMap.add(TOKEN_HEADER_NAME, headerVal);
		headrsMap.add("Content-Type", "application/json");
		
		HttpEntity headers = new HttpEntity(headrsMap);
		
		
		
		RestTemplate rt = new RestTemplate();
		
		ResponseEntity<String> resp = rt.exchange(
				TOKEN_URL, HttpMethod.GET, headers,
				String.class);
		//ResponseEntity<String> resp = rt.getForEntity(TOKEN_URL, String.class, headrsMap);
		System.out.println(resp.getStatusCodeValue());
	}
}

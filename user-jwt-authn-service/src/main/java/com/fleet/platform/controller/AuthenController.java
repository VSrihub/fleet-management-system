package com.fleet.platform.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fleet.platform.config.MedilabUserToken;
import com.fleet.platform.service.JwtUserAuthnService;

@RestController
@RequestMapping("/auth")
public class AuthenController {

	@Autowired
	private JwtUserAuthnService authnService;
	
	private static final String AUTHORIZATION_HEADER_VALUE_PREFIX = "Bearer";
	@PostMapping("/token")
	public ResponseEntity<MedilabUserToken> doLogin() {
		System.out.println("i am in user authn controller");
		MedilabUserToken userToken = new MedilabUserToken();
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
			
		if(auth != null && auth.isAuthenticated()) {
			System.out.println(auth.isAuthenticated());	
			List<String> rolesList = new ArrayList<String>();
			
			auth.getAuthorities().stream().forEach(sg->{
				rolesList.add(sg.getAuthority());
			});
			
			String token = authnService.createToken(auth.getName(), rolesList);
			//MedilabUserToken userToken = new MedilabUserToken();
			userToken.setAccess_token(token);
			userToken.setType(AUTHORIZATION_HEADER_VALUE_PREFIX);
			userToken.setValid(true);
			return ResponseEntity.status(HttpStatus.OK).body(userToken);
		}else {
			userToken.setValid(false);
			return ResponseEntity.status(HttpStatus.FORBIDDEN).body(userToken);
		}
		
	}
	
	
	
	
	
}

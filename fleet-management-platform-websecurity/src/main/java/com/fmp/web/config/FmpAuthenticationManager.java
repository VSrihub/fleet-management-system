package com.fmp.web.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Service;

import com.fmp.web.model.Role;
import com.fmp.web.model.User;
import com.fmp.web.repo.UserManagementRepo;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class FmpAuthenticationManager implements AuthenticationProvider {

	@Autowired
	private UserManagementRepo userRepo;
	
	
	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		log.info("the user name enetered in form is:\t"+authentication.getName());
		log.info("the password entered in form is:\t"+authentication.getCredentials());
		
		User user = userRepo.findUserByCreds(authentication.getName(), String.valueOf(authentication.getCredentials()));
		Role userRole = user.getRole();
		
		List<GrantedAuthority>  authorities = new ArrayList<GrantedAuthority>();
		GrantedAuthority ga = new SimpleGrantedAuthority(userRole.getRole());
		authorities.add(ga);
		
		Authentication authnObject = new UsernamePasswordAuthenticationToken(authentication.getName(), 
				authentication.getCredentials(), 
				authorities);
		
		return authnObject;
	}


	@Override
	public boolean supports(Class<?> authentication) {
		// TODO Auto-generated method stub
		return true;
	}

}

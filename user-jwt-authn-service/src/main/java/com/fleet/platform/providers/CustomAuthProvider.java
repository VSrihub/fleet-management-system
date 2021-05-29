/**
 * 
 */
package com.fleet.platform.providers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Component;

/**
 * @author nsanda
 *
 */
@Component
public class CustomAuthProvider implements AuthenticationProvider {

	/* (non-Javadoc)
	 * @see org.springframework.security.authentication.AuthenticationManager#authenticate(org.springframework.security.core.Authentication)
	 */
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		String userName = authentication.getName();
		String password = (String) authentication.getCredentials();
		if(userName != null && !userName.isEmpty() && (password != null && !password.isEmpty())) {
			//do a database call
			if(userName.equals(password)) {
				String role = "admin";
				SimpleGrantedAuthority sga = new SimpleGrantedAuthority(role);
				List<SimpleGrantedAuthority> rolesList = new ArrayList<SimpleGrantedAuthority>(); 
				return new UsernamePasswordAuthenticationToken(userName, null,rolesList);
			}
			
		}		
		return null;
	}

	public boolean supports(Class<?> authentication) {
		return true;
	}

}

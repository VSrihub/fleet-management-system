/**
 * 
 */
package com.fleet.platform.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.GenericFilterBean;

import com.fleet.platform.service.JwtUserAuthnService;

import lombok.extern.slf4j.Slf4j;

/**
 * @author nsanda
 *
 */
@Slf4j
public class JwtAuthnFilter extends GenericFilterBean {
	
	private JwtUserAuthnService authnService;
	
	public JwtAuthnFilter(JwtUserAuthnService authnService){
		this.authnService = authnService;
	}

	/* (non-Javadoc)
	 * @see javax.servlet.Filter#doFilter(javax.servlet.ServletRequest, javax.servlet.ServletResponse, javax.servlet.FilterChain)
	 */
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		log.info("JwtAuthnFilter....");
		boolean isTokenValidate = false;
		String tokenHash = authnService.resolveToken((HttpServletRequest)request);
		if(tokenHash != null && !tokenHash.isEmpty()) {
			log.info("token is already there");
			isTokenValidate = authnService.validateToken(tokenHash);
			if(!isTokenValidate) {
				//chain.doFilter(request, response);
			}
			
		}else {
			Authentication auth = authnService.authentication((HttpServletRequest)request);
			log.info("is authenticated :\t"+auth.isAuthenticated());
			SecurityContextHolder.getContext().setAuthentication(auth);
			isTokenValidate = true;
		}
		if(isTokenValidate) {
			chain.doFilter(request, response);
		}
		
	}

	private void doLogin(ServletRequest request) {
		Authentication auth = authnService.authentication((HttpServletRequest)request);
		log.info("is authenticated :\t"+auth.isAuthenticated());
		SecurityContextHolder.getContext().setAuthentication(auth);
	}
}

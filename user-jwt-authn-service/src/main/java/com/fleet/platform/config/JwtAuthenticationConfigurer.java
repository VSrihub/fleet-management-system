package com.fleet.platform.config;

import org.springframework.security.config.annotation.SecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.DefaultSecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.fleet.platform.filter.JwtAuthnFilter;
import com.fleet.platform.service.JwtUserAuthnService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class JwtAuthenticationConfigurer extends SecurityConfigurerAdapter<DefaultSecurityFilterChain, HttpSecurity> {
	private JwtUserAuthnService jwtAuthenticationService;

	public JwtAuthenticationConfigurer(JwtUserAuthnService jwtAuthenticationService) {
		this.jwtAuthenticationService = jwtAuthenticationService;
	}

	@Override
	public void configure(HttpSecurity http) throws Exception {
		log.info("i am in JwtAuthenticationConfigurer");
		JwtAuthnFilter jwtAuthenticationFilter = new JwtAuthnFilter(jwtAuthenticationService);
		http.addFilterBefore(jwtAuthenticationFilter, UsernamePasswordAuthenticationFilter.class);
	}
}
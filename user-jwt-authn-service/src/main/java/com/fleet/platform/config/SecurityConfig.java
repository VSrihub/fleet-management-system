package com.fleet.platform.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

import com.fleet.platform.providers.CustomAuthProvider;
import com.fleet.platform.service.JwtUserAuthnService;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{

	@Autowired
	private CustomAuthProvider custAuthnProvider;
	
	@Autowired
	private JwtUserAuthnService jwtUserAuthnService;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.authenticationProvider(custAuthnProvider);
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
		.authorizeRequests()
		.regexMatchers("/auth/token")
		//.antMatchers(HttpMethod.POST,"/auth/token")
		
		/*.permitAll()
		.anyRequest()*/
		.authenticated()
		.and()
		.apply(new JwtAuthenticationConfigurer(jwtUserAuthnService))
		.and()		
		.csrf().disable()
		.httpBasic()
		.disable()
		.sessionManagement()
		.sessionCreationPolicy(SessionCreationPolicy.STATELESS);		
	}
}

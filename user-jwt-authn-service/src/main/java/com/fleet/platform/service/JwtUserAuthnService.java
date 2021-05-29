/**
 * 
 */
package com.fleet.platform.service;

import java.util.Base64;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import com.fleet.platform.providers.CustomAuthProvider;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

/**
 * @author nsanda
 *
 */
@Component
public class JwtUserAuthnService {

	private static final String SECRETE_KEY = Base64.getEncoder().encodeToString("fmp-authn-token".getBytes());
	private static final long EXPIRATION_TIME = 86400000;
	
	private static final String AUTHORIZATION_HEADER_NAME = "Authorization";
	private static final String AUTHORIZATION_HEADER_VALUE_PREFIX = "Bearer ";
	private static final String AUTHORIZATION_HEADER_VALUE_PREFIX_USER_CREDS = "Basic ";
	private static final String EMPTY = "";
	
	@Autowired
	private CustomAuthProvider authProvider;	
	
	public String createToken(String userName, List<String> roles) {
		
		Claims userClaims = Jwts.claims();
		
		userClaims.setSubject(userName);
		
		userClaims.put("roles", roles);
		
		Date now = new Date();
		userClaims.setIssuedAt(now);
		
		Date validaity = new Date(now.getTime()+EXPIRATION_TIME);
		userClaims.setExpiration(validaity);
		
		return Jwts.builder().setClaims(userClaims).signWith(SignatureAlgorithm.HS256, SECRETE_KEY).compact();
		
	}
	
	public String resolveToken(HttpServletRequest request ) {
		String headerVal = null;
		String headerName= request.getHeader(AUTHORIZATION_HEADER_NAME);
		if(headerName != null && headerName.startsWith(AUTHORIZATION_HEADER_VALUE_PREFIX)) {
			headerVal = headerName.replace(AUTHORIZATION_HEADER_VALUE_PREFIX, EMPTY);
		}
		return headerVal;
	}
	
	public String resolveCredentialsToken(HttpServletRequest request ) {
		String headerVal = request.getHeader(AUTHORIZATION_HEADER_NAME);
		if(headerVal != null && headerVal.startsWith(AUTHORIZATION_HEADER_VALUE_PREFIX_USER_CREDS)) {
			headerVal = headerVal.replace(AUTHORIZATION_HEADER_VALUE_PREFIX_USER_CREDS, EMPTY);
		}
		return headerVal;
	}
	
	public boolean validateToken(String token) {
		boolean isTokenValid = false;
		Jws<Claims> userClaims = Jwts.parser().setSigningKey(SECRETE_KEY).parseClaimsJws(token);
		if(!userClaims.getBody().getExpiration().before(new Date())){
			isTokenValid =true;
		}
		return isTokenValid;
	}
	
	public String getUserName(String token) {
		Jws<Claims> userClaims = Jwts.parser().setSigningKey(SECRETE_KEY.getBytes()).parseClaimsJws(token);
		return userClaims.getBody().getSubject();
	}
	
	public Authentication authentication(HttpServletRequest request ) {
					
		String userCredentailsHeaderToken = resolveCredentialsToken(request);
		if(userCredentailsHeaderToken != null && !userCredentailsHeaderToken.isEmpty()) {
			String userDecodedToken = new String(Base64.getDecoder().decode(userCredentailsHeaderToken.getBytes()));
			if(userDecodedToken != null && !userDecodedToken.isEmpty()) {
				String userName = userDecodedToken.split(":")[0];
				String password = userDecodedToken.split(":")[1];
				
				Authentication authn = new UsernamePasswordAuthenticationToken(userName, password);
				authn = authProvider.authenticate(authn);
				return authn;
			}
		}
		return null;
}
	
}

package com.fmp.web;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class ForTesting {

	public static void main(String[] args) {
		PasswordEncoder encoder = new BCryptPasswordEncoder();
		String encodedPwd = encoder.encode("admin");
		System.out.println(encodedPwd);
		System.out.println(encoder.matches("admin", encodedPwd));

	}

}

package com.fmp.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/login")
public class LoginController {

	@RequestMapping("/login")
	public String viewLoginPage() {
		
		return "login";
	}
}

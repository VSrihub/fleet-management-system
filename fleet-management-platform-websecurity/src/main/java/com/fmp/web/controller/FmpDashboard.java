package com.fmp.web.controller;


import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dashboard")
public class FmpDashboard {

	@RequestMapping
	public String viewDashboard() {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		System.out.println("logged ub user name is:\t"+auth.getName());
		System.out.println("logged in user authorirries are:\t"+auth.getAuthorities());
		System.out.println("logged in user password is:\t"+auth.getCredentials());
		return "dashboard";
	}
}

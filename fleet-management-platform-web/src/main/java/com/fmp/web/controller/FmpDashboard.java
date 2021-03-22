package com.fmp.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dashboard")
public class FmpDashboard {

	@RequestMapping
	public String viewDashboard() {
		return "dashboard";
	}
}

package com.fmp.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customers")
public class CustomerManagementController {

	@RequestMapping
	public String viewDriversDashboard() {
		return "customer/customerManagement";
	}
}

package com.fmp.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/drivers")
public class DriverManagementController {

	@RequestMapping
	public String viewDriversDashboard() {
		return "driver/driversManagement";
	}
}

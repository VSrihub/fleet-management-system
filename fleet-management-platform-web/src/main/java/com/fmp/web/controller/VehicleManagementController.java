package com.fmp.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/vehicle")
public class VehicleManagementController {

	@RequestMapping
	public String viewVehicleManagementBoard() {
		return "vehicle/vehicleManagement";
	}
	
	@RequestMapping("/addView")
	public String viewAddVehiclePage() {
		return "vehicle/addVehicle";
	}
}

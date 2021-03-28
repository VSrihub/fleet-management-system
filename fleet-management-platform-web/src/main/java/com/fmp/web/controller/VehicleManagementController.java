package com.fmp.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fmp.web.bean.VehicleBean;
import com.fmp.web.service.VehicleService;

@Controller
@RequestMapping("/vehicle")
public class VehicleManagementController {

	@Autowired
	private VehicleService vehicleService;
	
	
	
	@RequestMapping
	public String viewVehicleManagementBoard(Model model) {
		List<VehicleBean> vbeanList = vehicleService.findAll();
		model.addAttribute("vbeanList", vbeanList);
		return "vehicle/vehicleManagement";
	}
	
	@RequestMapping("/addView")
	public String viewAddVehiclePage(Model model) {
		model.addAttribute("vehicleData", new VehicleBean());
		return "vehicle/addVehicle";
	}
	
	@RequestMapping("/addVehicle")
	public String addVehicle(@ModelAttribute("vehicleData") VehicleBean vbean,Model model) {
		System.out.println("i am in add vehicle:\t"+vbean.toString());
		vbean = vehicleService.save(vbean);
		System.out.println("saved vehicle data is:\t"+vbean.toString());
		
		List<VehicleBean> vbeanList = vehicleService.findAll();
		model.addAttribute("vbeanList", vbeanList);
		
		return "vehicle/vehicleManagement";
	}
	
	@RequestMapping("/deleteVehicle/{vehicleId}")
	public String deleteVehicle(@PathVariable("vehicleId") String vehicleId,Model model) {
		System.out.println("i am in delete vehicle:\t"+vehicleId);
		List<VehicleBean> vbeanList = vehicleService.delete(vehicleId);
		model.addAttribute("vbeanList", vbeanList);
		
		return "redirect:/vehicle";
	}
	
	@RequestMapping("/editVehicle/{vehicleId}")
	public String editVehicle(@PathVariable("vehicleId") String vehicleId,Model model) {
		System.out.println("i am in delete vehicle:\t"+vehicleId);
		VehicleBean vbean = vehicleService.findById(vehicleId);
		model.addAttribute("vehicleData", vbean);
		return "vehicle/viewVehicle";
	}
	
	@RequestMapping("/updateVehicle")
	public String updateVehicle(@ModelAttribute("vehicleData") VehicleBean vbean,Model model) {
		System.out.println("i am in add vehicle:\t"+vbean.toString());
		vbean = vehicleService.update(vbean);
		System.out.println("update vehicle data is:\t"+vbean.toString());
		
		List<VehicleBean> vbeanList = vehicleService.findAll();
		model.addAttribute("vbeanList", vbeanList);
		
		return "vehicle/vehicleManagement";
	}
}

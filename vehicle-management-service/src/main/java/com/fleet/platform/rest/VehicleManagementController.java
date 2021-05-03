package com.fleet.platform.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fleet.platform.bean.VehicleBean;
import com.fleet.platform.service.VehicleService;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/vehicle")
@Slf4j
public class VehicleManagementController {

	
	@Autowired
	private VehicleService vehicleService;
	
	
	@RequestMapping(value="/addVehicle",method=RequestMethod.POST)
	public @ResponseBody List<VehicleBean> addVehicle(@RequestBody VehicleBean vbean) {
		log.info("i am in add vehicle:\t"+vbean.toString());
		vbean = vehicleService.save(vbean);
		System.out.println("saved vehicle data is:\t"+vbean.toString());
		
		List<VehicleBean> vbeanList = vehicleService.findAll();
		
		return vbeanList;
	}
	
	@RequestMapping(value="/deleteVehicle/{vehicleId}",method=RequestMethod.DELETE)
	public @ResponseBody List<VehicleBean> deleteVehicle(@PathVariable("vehicleId") String vehicleId) {
		System.out.println("i am in delete vehicle:\t"+vehicleId);
		List<VehicleBean> vbeanList = vehicleService.delete(vehicleId);
		
		return vbeanList;
	}
	
	@RequestMapping(value="/editVehicle/{vehicleId}",method=RequestMethod.GET)
	public @ResponseBody VehicleBean editVehicle(@PathVariable("vehicleId") String vehicleId) {
		System.out.println("i am in delete vehicle:\t"+vehicleId);
		VehicleBean vbean = vehicleService.findById(vehicleId);
		return vbean;
	}
	
	@RequestMapping(value="/updateVehicle",method=RequestMethod.PUT)
	public @ResponseBody List<VehicleBean> updateVehicle(@RequestBody VehicleBean vbean) {
		System.out.println("i am in add vehicle:\t"+vbean.toString());
		vbean = vehicleService.update(vbean);
		System.out.println("update vehicle data is:\t"+vbean.toString());
		
		List<VehicleBean> vbeanList = vehicleService.findAll();
		
		return vbeanList;
	}
	
	@RequestMapping(value="/getAllVehicle",method=RequestMethod.GET)
	public @ResponseBody List<VehicleBean> findAllVehicle() {
		List<VehicleBean> vbeanList = vehicleService.findAll();
		
		return vbeanList;
	}
}

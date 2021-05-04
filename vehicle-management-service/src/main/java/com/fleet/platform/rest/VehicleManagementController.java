package com.fleet.platform.rest;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fleet.platform.bean.VehicleBean;
import com.fleet.platform.service.VehicleService;

import lombok.extern.slf4j.Slf4j;

//@Controller
@RestController
//@RequestMapping("/vehicle")
@Slf4j
public class VehicleManagementController {

	
	@Autowired
	private VehicleService vehicleService;
	
	
	//@RequestMapping(value="/addVehicle",method=RequestMethod.POST)
	@PostMapping("/vehicle")
	public List<VehicleBean> addVehicle(@Valid @RequestBody VehicleBean vbean) {
		log.info("i am in add vehicle:\t"+vbean.toString());
		vbean = vehicleService.save(vbean);
		System.out.println("saved vehicle data is:\t"+vbean.toString());
		
		List<VehicleBean> vbeanList = vehicleService.findAll();
		
		return vbeanList;
	}
	
	//@RequestMapping(value="/deleteVehicle/{vehicleId}",method=RequestMethod.DELETE)
	@DeleteMapping("/vehicle")
	public  List<VehicleBean> deleteVehicle(@PathVariable("vehicleId") String vehicleId) {
		System.out.println("i am in delete vehicle:\t"+vehicleId);
		List<VehicleBean> vbeanList = vehicleService.delete(vehicleId);
		
		return vbeanList;
	}
	
	//@RequestMapping(value="/editVehicle/{vehicleId}",method=RequestMethod.GET)
	@GetMapping("/vehicle/{vehicleId}")
	public  VehicleBean editVehicle(@PathVariable("vehicleId") String vehicleId) {
		System.out.println("i am in delete vehicle:\t"+vehicleId);
		VehicleBean vbean = vehicleService.findById(vehicleId);
		return vbean;
	}
	
	//@RequestMapping(value="/updateVehicle",method=RequestMethod.PUT)
	@PutMapping("/vehicle")
	public  List<VehicleBean> updateVehicle(@RequestBody VehicleBean vbean) {
		System.out.println("i am in add vehicle:\t"+vbean.toString());
		vbean = vehicleService.update(vbean);
		System.out.println("update vehicle data is:\t"+vbean.toString());
		
		List<VehicleBean> vbeanList = vehicleService.findAll();
		
		return vbeanList;
	}
	
	//@RequestMapping(value="/getAllVehicle",method=RequestMethod.GET)
	@GetMapping("/vehicle")
	public  List<VehicleBean> findAllVehicle() {
		List<VehicleBean> vbeanList = vehicleService.findAll();
		
		return vbeanList;
	}
}

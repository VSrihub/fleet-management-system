/**
 * 
 */
package com.fmp.driver;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;


/**
 * @author nsanda
 *
 */
@RestController
@RequestMapping("/api")
@Slf4j
public class DriversController {

	
	@Autowired
	private DriversService service;
	
	
	@GetMapping("/drivers")
	public ResponseEntity<List<DriverBean>> viewDashboard() {
		List<DriverBean> vBeanList = service.findAll();

		return ResponseEntity.status(HttpStatus.FOUND).body(vBeanList);
	}
	
	@GetMapping(value="/drivers/{id}")
	public ResponseEntity<DriverBean>  findVehicleById(@PathVariable("id") int vehicleId){
		
		DriverBean vb = service.findById(vehicleId);
		return ResponseEntity.status(HttpStatus.FOUND).body(vb);
	}
	
	@PostMapping("/drivers")
	public ResponseEntity<DriverBean>  addVehicle(@RequestBody DriverBean vbean) {
		System.out.println("User inputted data is:\t"+vbean.toString());
		try {
			vbean = service.save(vbean);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return ResponseEntity.status(HttpStatus.CREATED).body(vbean);
	}	
}

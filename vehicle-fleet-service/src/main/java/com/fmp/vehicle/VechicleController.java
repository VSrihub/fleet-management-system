/**
 * 
 */
package com.fmp.vehicle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fmp.vehicle.service.VehicleService;

import lombok.extern.slf4j.Slf4j;

/**
 * @author nsanda
 *
 */

@RestController
@RefreshScope
@RequestMapping("/api")
@Slf4j
public class VechicleController {
	


	@Autowired
	private VehicleService vservice;
	
	@Value("${todays.fuel.cost}")
	private String todaysFuelCost;
	
	@GetMapping(value="/vehicles")
	public ResponseEntity<List<VehicleBean>>  findAllVehicles(){
			log.info("Todays Fuel Cost is:\t"+todaysFuelCost);	
		return ResponseEntity.ok(vservice.findAll());
	}
	
	@GetMapping(value="/vehicles/{id}")
	public ResponseEntity<VehicleBean>  findVehicleById(@PathVariable("id") int vehicleId){
		
		VehicleBean vb = vservice.findById(vehicleId);
		return ResponseEntity.status(HttpStatus.OK).body(vb);
	}
	
	@PostMapping(value="/vehicles")
	public ResponseEntity<VehicleBean>  saveVehicles(@RequestBody VehicleBean vb){
		try {
			vservice.save(vb);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return ResponseEntity.status(HttpStatus.CREATED).body(vb);
	}
	
	
	
	
	
}

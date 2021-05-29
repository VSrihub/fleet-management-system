package com.fmp.driver;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


//@FeignClient(name="VehileServiceFeignClient",url="http://192.168.1.4:9191")
//@FeignClient(name="vehicle-management-service")
@FeignClient(name="fleet-management-gateway")
//@RibbonClient(name="vehicle-service")
public interface VehileServiceFeignClient {

	@GetMapping("/gateway/vehicle-management-service/vehicle/{id}")
	public ResponseEntity<String>  findVehicleById(@PathVariable("id") String id);
}

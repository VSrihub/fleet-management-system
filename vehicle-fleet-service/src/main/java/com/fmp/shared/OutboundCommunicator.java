/**
 * 
 */
package com.fmp.shared;

import org.springframework.web.client.RestTemplate;

import lombok.extern.slf4j.Slf4j;

/**
 * @author nsanda
 *
 */
@Slf4j
public class OutboundCommunicator {

	public static String fetchDriverInfo(int id) {
		RestTemplate rt = new RestTemplate();
		
		String driverInfo = rt.getForEntity(APIConstants.DRIVER_API_BASE_URL+id, String.class).getBody();
		log.info("driverInfo is:\t"+driverInfo);
		return driverInfo;
	}
	
	public static String fetchVechileInfo(int id) {
		RestTemplate rt = new RestTemplate();
		
		String vehicleInfo = rt.getForEntity(APIConstants.VEHICLE_API_BASE_URL+id, String.class).getBody();
		log.info("vehicleInfo is:\t"+vehicleInfo);
		return vehicleInfo;
	}
	
	public static void main(String[] args) {
		OutboundCommunicator.fetchDriverInfo(1);
		OutboundCommunicator.fetchVechileInfo(1);
	}
	
}

package com.fleet.platform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class FleetManagementGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(FleetManagementGatewayApplication.class, args);
	}

}

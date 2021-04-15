package com.fmp.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.zaxxer.hikari.HikariDataSource;

@SpringBootApplication

public class FleetManagementPlatformWebApplication implements CommandLineRunner{

	@Autowired
	private HikariDataSource hikariDs;
	
	public static void main(String[] args) {
		
		SpringApplication.run(FleetManagementPlatformWebApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("max pool size is:\t"+hikariDs.getMaximumPoolSize());
		System.out.println("lifetime of connection object in active pool is:\t"+hikariDs.getMaxLifetime());
		System.out.println("minimum idle time of the connection object:\t"+hikariDs.getMinimumIdle());
		System.out.println("max active connection objectes are:\t"+hikariDs.getMinimumIdle());
		
	}

}

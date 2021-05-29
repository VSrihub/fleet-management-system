package com.fleet.platform;

import javax.validation.Validator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

@SpringBootApplication
@EnableDiscoveryClient
public class VehicleManagementServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(VehicleManagementServiceApplication.class, args);
	}

	@Bean
	@Primary
	public Validator  localValidatorFactoryBean() {
		return new LocalValidatorFactoryBean();
	}
}

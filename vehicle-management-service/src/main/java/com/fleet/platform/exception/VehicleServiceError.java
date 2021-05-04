package com.fleet.platform.exception;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class VehicleServiceError {

	private int code;
	private String message;
	private String property;
}

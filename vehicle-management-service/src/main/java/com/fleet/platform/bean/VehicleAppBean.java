package com.fleet.platform.bean;

import java.util.List;

import com.fleet.platform.exception.VehicleServiceException;
import com.fleet.platform.exception.VehicleServiceValidationError;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class VehicleAppBean {

	private List<VehicleServiceValidationError> validationErrors;
	private List<VehicleServiceException> errors;
}

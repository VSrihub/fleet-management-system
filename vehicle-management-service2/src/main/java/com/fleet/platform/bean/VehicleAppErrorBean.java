package com.fleet.platform.bean;

import java.util.List;

import com.fleet.platform.exception.VehicleServiceException;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class VehicleAppErrorBean {

	//private List<VehicleServiceValidationError> validationErrors;
	private List<VehicleServiceException> errors;
}

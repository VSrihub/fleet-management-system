package com.fleet.platform.bean;

import java.util.List;

import com.fleet.platform.exception.VehicleServiceError;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class VehicleAppBean {

	private List<VehicleServiceError> errors;
}

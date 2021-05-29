package com.fleet.platform.exception;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class VehicleServiceException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int code;
	private String message;
	private Date timeStamp;
	public VehicleServiceException(String message) {
		//super();
		this.message = message;
		this.timeStamp = new Date();
	}	
 
	
}

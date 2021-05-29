package com.fleet.platform.exception;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.fleet.platform.bean.VehicleAppBean;
import com.fleet.platform.bean.VehicleAppErrorBean;



@ControllerAdvice
public class VehicleServiceExceptionHandler extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(VehicleServiceException.class)
	public ResponseEntity<VehicleAppErrorBean> handleVehicleServiceException(VehicleServiceException vse){
		VehicleAppErrorBean appBean = new VehicleAppErrorBean();
		List<VehicleServiceException>  se = new ArrayList<>();
		se.add(vse);
		appBean.setErrors(se);
		return ResponseEntity.badRequest().body(appBean);
	}

	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
			
		List<VehicleServiceValidationError> validationErrorsList = new ArrayList<VehicleServiceValidationError>();
		
		ex.getBindingResult().getFieldErrors().stream().forEach(fe->{
			VehicleServiceValidationError error = new VehicleServiceValidationError();
			error.setMessage(fe.getDefaultMessage());
			error.setCode(status.value());
			error.setProperty(fe.getField());
			validationErrorsList.add(error);
		});
		
		VehicleAppBean appBean = new VehicleAppBean();
		appBean.setValidationErrors(validationErrorsList);
		
		return ResponseEntity.badRequest().body(appBean);
	}
}

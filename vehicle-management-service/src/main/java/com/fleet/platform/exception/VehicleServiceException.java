package com.fleet.platform.exception;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.fleet.platform.bean.VehicleAppBean;



@ControllerAdvice
public class VehicleServiceException extends ResponseEntityExceptionHandler {

	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
			
		List<VehicleServiceError> validationErrorsList = new ArrayList<VehicleServiceError>();
		
		ex.getFieldErrors().stream().forEach(fe->{
			VehicleServiceError error = new VehicleServiceError();
			error.setMessage(fe.getDefaultMessage());
			error.setCode(status.value());
			error.setProperty(fe.getField());
			validationErrorsList.add(error);
		});
		
		VehicleAppBean appBean = new VehicleAppBean();
		appBean.setErrors(validationErrorsList);
		
		return ResponseEntity.badRequest().body(appBean);
	}
}

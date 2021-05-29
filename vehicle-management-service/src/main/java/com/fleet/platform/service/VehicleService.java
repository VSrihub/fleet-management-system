package com.fleet.platform.service;

import java.util.List;

import com.fleet.platform.bean.VehicleBean;
import com.fleet.platform.exception.VehicleServiceException;
import com.fleet.platform.model.Vehicle;


public interface VehicleService {

	public VehicleBean save(VehicleBean vbean) throws VehicleServiceException;
	public VehicleBean update(VehicleBean vbean) throws VehicleServiceException;;
	public List<VehicleBean> findAll() throws VehicleServiceException;;
	public VehicleBean findById(String id) throws VehicleServiceException;;
	public VehicleBean findByRegNo(String regNo) throws VehicleServiceException;;
	public List<VehicleBean> delete(String id) throws VehicleServiceException;;
	public List<VehicleBean> delete(Vehicle vehicle) throws VehicleServiceException;;
}

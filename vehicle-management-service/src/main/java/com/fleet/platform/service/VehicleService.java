package com.fleet.platform.service;

import java.util.List;

import com.fleet.platform.bean.VehicleBean;
import com.fleet.platform.model.Vehicle;


public interface VehicleService {

	public VehicleBean save(VehicleBean vbean);
	public VehicleBean update(VehicleBean vbean);
	public List<VehicleBean> findAll();
	public VehicleBean findById(String id);
	public VehicleBean findByRegNo(String regNo);
	public List<VehicleBean> delete(String id);
	public List<VehicleBean> delete(Vehicle vehicle);
}

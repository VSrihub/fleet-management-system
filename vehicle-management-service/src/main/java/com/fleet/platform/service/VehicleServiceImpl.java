package com.fleet.platform.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.fleet.platform.bean.VehicleBean;
import com.fleet.platform.dao.VehicleDao;
import com.fleet.platform.model.Vehicle;
import com.fleet.platform.repo.VehicleManagementRepo;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class VehicleServiceImpl implements VehicleService {

	@Autowired
	private VehicleManagementRepo vehicleRepo;
	
	@Autowired
	private TransactionDefinition def;
	
	@Autowired
	private VehicleDao vehicleDao;
	
	@Override
	@Transactional(isolation=Isolation.READ_COMMITTED,
	propagation=Propagation.REQUIRED,
	timeout=3)
	public VehicleBean save(VehicleBean vbean) {
		Vehicle vehicle = new Vehicle();
		
		//S3 bucket
		
		
		BeanUtils.copyProperties(vbean, vehicle);
		if(vbean.getV_id() == null || vbean.getV_id().isEmpty()) {
			vehicle.setV_id(UUID.randomUUID().toString());
		}
		
		//saving to db
		vehicleRepo.save(vehicle);
		
		vehicleDao.findAll();
		
		BeanUtils.copyProperties(vehicle, vbean);
		
		return vbean;
	}

	@Override
	public List<VehicleBean> findAll() {
		List<Vehicle> vehicleDomainsList = vehicleRepo.findAll();
		List<VehicleBean> vehicleBeanList = new ArrayList<VehicleBean>();
		if(vehicleDomainsList != null && vehicleDomainsList.size() >0) {
			vehicleDomainsList.stream().forEach(vd->{
				VehicleBean vbean = new VehicleBean();
				BeanUtils.copyProperties(vd, vbean);
				vehicleBeanList.add(vbean);
			});
		}
		
		return vehicleBeanList;
	}

	@Override
	@Transactional(isolation=Isolation.READ_COMMITTED,
	propagation=Propagation.REQUIRED)
	public VehicleBean findById(String id) {
		Optional<Vehicle> vehicleModel = vehicleRepo.findById(id);
		VehicleBean vbean = new VehicleBean();
		BeanUtils.copyProperties(vehicleModel.get(), vbean);
		return vbean;
	}

	@Override
	public VehicleBean findByRegNo(String regNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<VehicleBean> delete(String id) {
		vehicleRepo.deleteById(id);		
		return findAll();
	}

	@Override
	public List<VehicleBean> delete(Vehicle vehicle) {
		
		return null;
	}

	@Override
	public VehicleBean update(VehicleBean vbean) {
		Vehicle vehicle = new Vehicle();
		
		BeanUtils.copyProperties(vbean, vehicle);
		
		//saving to db
		vehicleRepo.save(vehicle);
		
		BeanUtils.copyProperties(vehicle, vbean);
		
		return vbean;
	}

}

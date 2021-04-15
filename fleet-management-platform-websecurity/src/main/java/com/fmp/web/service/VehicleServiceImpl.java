package com.fmp.web.service;

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

import com.fmp.web.bean.VehicleBean;
import com.fmp.web.dao.VehicleDao;
import com.fmp.web.model.Vehicle;
import com.fmp.web.repo.VehicleManagementRepo;

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
		/*if(!vehicle.getV_id().equals("1")) {
			throw new RuntimeException("data mismatch and hence rolling back the data");
		}*/
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
	propagation=Propagation.MANDATORY)
	public VehicleBean findById(String id) {
		log.debug("i am in findby ID**********88:\t"+def.getPropagationBehavior());
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

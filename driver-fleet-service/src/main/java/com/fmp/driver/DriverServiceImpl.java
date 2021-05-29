/**
 * 
 */
package com.fmp.driver;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

/**
 * @author nsanda
 *
 */
@Service
@Slf4j
public class DriverServiceImpl implements DriversService {
	
	@Autowired
	private DriverRepo repo;
	
	@Autowired
	private VehileServiceFeignClient  vehicleFeignClient;
	
	@Override
	public DriverBean save(DriverBean vbean) {
		log.info("vehicle bean data in service is  ****:\t"+vbean.toString());		
		
		Driver vdomain = new Driver();
		ResponseEntity<String> vehicleResp = vehicleFeignClient.findVehicleById(vbean.getVehicle());
		log.info("vehicle service response code is:\t"+vehicleResp.getStatusCodeValue());
		if(vehicleResp != null && vehicleResp.getStatusCodeValue()==HttpStatus.OK.value()) {
			String vehicleInfo = vehicleResp.getBody();
			log.info("vehicle service response data is:\t"+vehicleInfo);
			vdomain.setVehicleDetails(vehicleInfo);
		}
		BeanUtils.copyProperties(vbean, vdomain);
		log.info("vehicle domain data in service is:\t"+vdomain.toString());
		
		
		
		
		
		repo.save(vdomain);
		BeanUtils.copyProperties(vdomain, vbean);
		return vbean;
	}


	@Override
	public List<DriverBean> findAll() {
		List<Driver> vlist = repo.findAll();
		List<DriverBean> beanList = new ArrayList<DriverBean>();
		
		vlist.stream().forEach(vDomain->{
			DriverBean vbean = new DriverBean();
			BeanUtils.copyProperties(vDomain, vbean);
			beanList.add(vbean);
		});
		
		
		return beanList;
	}

	@Override
	public DriverBean findById(int id) {
		Driver vdomain = repo.findById(id).get();
		DriverBean vbean = new DriverBean();
		BeanUtils.copyProperties(vdomain, vbean);
		return vbean;
	}

	@Override
	public boolean deleteById(int id) {
      log.info("the record should be delete with the id:\t"+id);
      repo.deleteById(id);
      boolean isExisted = repo.existsById(id);
		return !isExisted;
	}


}

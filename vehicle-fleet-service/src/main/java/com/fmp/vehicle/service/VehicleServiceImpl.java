/**
 * 
 */
package com.fmp.vehicle.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionDefinition;

import com.fmp.vehicle.Vehicle;
import com.fmp.vehicle.VehicleBean;
import com.fmp.vehicle.VehicleRepo;

/**
 * @author nsanda
 *
 */
@Service
//@Slf4j
public class VehicleServiceImpl implements VehicleService {
	
	@Autowired
	private TransactionDefinition td;
	

	//private static Logger logger = Logger.class.getl
	java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VehicleServiceImpl.class.getName());
	
	
	@Autowired
	private VehicleRepo repo;
	
	/*@Autowired
	private DriverRepo driverRepo;
	
	@Autowired
	private DriversService driverService;*/
	
	

	@Override
	public VehicleBean save(VehicleBean vbean) throws Exception {
		Vehicle vdomain = new Vehicle();
		
		
		
		BeanUtils.copyProperties(vbean, vdomain);
		
		/*DriverBean  d = new DriverBean();
		d.setAddress("Hyd");
		d.setAge("29");
		//d.setDoj("");
		d.setLicenseNum("123456");
		//d.setLicExpDate(new Date());
		d.setMobileNum(9876543210l);
		d.setName("kindy");
		d.setNotes("test");
		d.setTotalExp(3.6);
		
		driverService.save(d);*/
		
		repo.save(vdomain);
		if(vdomain.getModel() == null || vdomain.getModel().isEmpty()) {
			//throw new RuntimeException("No Model found for vehicle:\t"+vdomain.getRegNum());
			throw new Exception("No Model found for vehicle:\t"+vdomain.getRegNum());
		}
		
		
		
		BeanUtils.copyProperties(vdomain, vbean);
		return vbean;
	}

	@Override
	public List<VehicleBean> findAll() {
		logger.info("i am in find all");
		logger.info("Transaction Time out is:\t"+td.getTimeout());
		logger.info("is transaction readable:\t"+td.isReadOnly());
		logger.info("the isolation level is:\t"+td.getIsolationLevel());
		List<Vehicle> vlist = repo.findAll();
		
		//List<DriverBean> driversList = driverService.findAll();
		
		
		
		List<VehicleBean> beanList = new ArrayList<VehicleBean>();
		
		vlist.stream().forEach(vDomain->{
			/*if(vDomain.getModel() == null) {
				throw new RuntimeException("No models foud");
			}*/
			VehicleBean vbean = new VehicleBean();
			BeanUtils.copyProperties(vDomain, vbean);
			beanList.add(vbean);
		});
		
		//jpat.getTransaction(td).isCompleted()
		return beanList;
	}

	@Override
	public VehicleBean findById(int id) {
		Vehicle vdomain = repo.findById(id).get();
		VehicleBean vbean = new VehicleBean();
		BeanUtils.copyProperties(vdomain, vbean);
		return vbean;
	}

	@Override
	public boolean deleteById(int id) {
      
      repo.deleteById(id);
      boolean isExisted = repo.existsById(id);
		return !isExisted;
	}


}

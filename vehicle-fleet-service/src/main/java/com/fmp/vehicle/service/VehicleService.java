/**
 * 
 */
package com.fmp.vehicle.service;

import java.util.List;

import com.fmp.vehicle.VehicleBean;

/**
 * @author nsanda
 *
 */
public interface VehicleService {
  public VehicleBean save(VehicleBean vbean) throws Exception;
  
  public List<VehicleBean>  findAll();
  
  public VehicleBean findById(int id);
  
  public boolean deleteById(int id);
}

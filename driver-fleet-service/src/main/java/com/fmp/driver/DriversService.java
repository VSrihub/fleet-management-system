/**
 * 
 */
package com.fmp.driver;

import java.util.List;

/**
 * @author nsanda
 *
 */
public interface DriversService {
  public DriverBean save(DriverBean vbean);
  
  public List<DriverBean>  findAll();
  
  public DriverBean findById(int id);
  
  public boolean deleteById(int id);
}

/**
 * 
 */
package com.fmp.web.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fmp.web.model.Vehicle;

/**
 * @author nsanda
 *
 */
public interface VehicleManagementRepo extends JpaRepository<Vehicle, String>{

}

/**
 * 
 */
package com.fleet.platform.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fleet.platform.model.Vehicle;



/**
 * @author nsanda
 *
 */
public interface VehicleManagementRepo extends JpaRepository<Vehicle, String>{

}

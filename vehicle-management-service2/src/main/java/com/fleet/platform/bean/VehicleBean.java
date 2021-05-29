/**
 * 
 */
package com.fleet.platform.bean;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author nsanda
 *
 */
@Data
@NoArgsConstructor
public class VehicleBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String v_id;
	
	@NotEmpty(message="Vehicle Registration Number should be entered")
	private String v_registration_no;
	
	@NotEmpty(message="Vehicle Name should be entered")
	private String v_name;
	private String v_model;
	private String v_chassis_no;
	private String v_engine_no;
	private String v_manufactured_by;

}

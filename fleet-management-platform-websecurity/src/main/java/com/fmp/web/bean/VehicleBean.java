/**
 * 
 */
package com.fmp.web.bean;

import java.io.Serializable;

import lombok.Data;

/**
 * @author nsanda
 *
 */
@Data
public class VehicleBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String v_id;
	private String v_registration_no;
	private String v_name;
	private String v_model;
	private String v_chassis_no;
	private String v_engine_no;
	private String v_manufactured_by;

}

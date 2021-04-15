/**
 * 
 */
package com.fmp.web.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

/**
 * @author nsanda
 *
 */
@Entity
@Data
public class Vehicle implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private String v_id;
	private String v_registration_no;
	private String v_name;
	private String v_model;
	private String v_chassis_no;
	private String v_engine_no;
	private String v_manufactured_by;

}

/**
 * 
 */
package com.fmp.vehicle;

import java.io.Serializable;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author nsanda
 *
 */
@Setter
@Getter
@ToString
public class VehicleBean implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7032914886487297965L;
	
	private int id;
	
	private String regNum;
	private String name;
	private String model;
	private String chasisNum;
	private int engineNum;
	private String mfgBy;
	

}

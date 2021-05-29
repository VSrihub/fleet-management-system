/**
 * 
 */
package com.fmp.driver;

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
public class DriverBean implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7032914886487297965L;
	
	private int id;
	
	private long mobileNum;
	private String name;
	private String age;
	private String licenseNum;
	private double totalExp;
	private String notes;
	private String address;
	
	private String licExpDate;
	private String doj;
	private String vehicle;
	

}

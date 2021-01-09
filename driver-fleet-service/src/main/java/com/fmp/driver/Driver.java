/**
 * 
 */
package com.fmp.driver;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

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
@Entity
public class Driver implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7032914886487297965L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private long mobileNum;
	private String name;
	private String age;
	private String licenseNum;
	private double totalExp;
	private String notes;
	private String address;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date licExpDate;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date doj;
	

}

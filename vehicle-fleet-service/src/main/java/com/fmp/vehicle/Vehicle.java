/**
 * 
 */
package com.fmp.vehicle;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author nsanda
 *
 */
@Entity
@Setter
@Getter
@ToString
public class Vehicle implements Serializable {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 668137993857660064L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String regNum;
	private String name;
	private String model;
	private String chasisNum;
	private int engineNum;
	private String mfgBy;
}

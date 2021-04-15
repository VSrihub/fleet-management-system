package com.fmp.web.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(nullable=false)
	private String fname;
	private String lname;
	
	@Column(unique=true,nullable=false)
	private String email;
	
	@Column(nullable=false)
	private String password;
	
	@Column(unique=true,nullable=false)
	private String mobile;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Role role;

}

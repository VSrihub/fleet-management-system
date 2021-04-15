/**
 * 
 */
package com.fmp.web.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author nsanda
 *
 */
@Entity
@Data
@NoArgsConstructor
public class Role implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private String role;
	
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	private List<Permission> permList;

}

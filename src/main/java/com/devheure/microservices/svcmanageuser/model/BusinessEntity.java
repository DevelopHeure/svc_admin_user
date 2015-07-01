/**
 * 
 */
package com.devheure.microservices.svcmanageuser.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author throdo
 *
 */
@Entity
@Table (name="business_entity")
public class BusinessEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6460865452231255878L;

	@Id
	private Integer id;

	private String name;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

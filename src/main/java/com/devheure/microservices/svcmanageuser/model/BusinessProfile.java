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
@Table (name="business_profile")
public class BusinessProfile implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5162910785223586019L;

	@Id
	private Integer id;

	private String name;

	public String getBusinessProfile() {
		return name;
	}

	public void setBusinessProfile(String businessProfile) {
		this.name = businessProfile;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	
	public BusinessProfile() {
		super();
	}

	public BusinessProfile(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	
}

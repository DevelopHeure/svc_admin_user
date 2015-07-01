/**
 * 
 */
package com.devheure.microservices.svcmanageuser.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 * @author throdo
 *
 */
@Entity
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -422646120454201819L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private String name;

	private String email;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn (name = "profile_id")
	private BusinessProfile profile;

	@OneToOne(fetch = FetchType.LAZY)
	private BusinessEntity entity;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public BusinessProfile getProfile() {
		return profile;
	}

	public void setProfile(BusinessProfile profile) {
		this.profile = profile;
	}

	public BusinessEntity getEntity() {
		return entity;
	}

	public void setEntity(BusinessEntity entity) {
		this.entity = entity;
	}

}

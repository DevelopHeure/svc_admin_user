/**
 * 
 */
package com.devheure.microservices.svcmanageuser.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.devheure.microservices.svcmanageuser.model.BusinessEntity;

/**
 * @author throdo
 *
 */
@RepositoryRestResource(collectionResourceRel = "businessentities", path = "businessentities")
public interface IBusinessProfileRepository extends
		JpaRepository<BusinessEntity, Integer> {

}

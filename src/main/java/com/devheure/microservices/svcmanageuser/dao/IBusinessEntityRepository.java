/**
 * 
 */
package com.devheure.microservices.svcmanageuser.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.devheure.microservices.svcmanageuser.model.BusinessProfile;

/**
 * @author throdo
 *
 */
@RepositoryRestResource(collectionResourceRel = "businessprofiles", path = "businessprofiles")
public interface IBusinessEntityRepository extends
		JpaRepository<BusinessProfile, Integer> {

}

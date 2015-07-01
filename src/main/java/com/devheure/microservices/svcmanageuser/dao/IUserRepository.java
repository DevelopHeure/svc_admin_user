/**
 * 
 */
package com.devheure.microservices.svcmanageuser.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.devheure.microservices.svcmanageuser.model.User;

/**
 * @author throdo
 *
 */
@RepositoryRestResource(collectionResourceRel = "users", path = "users")
public interface IUserRepository extends JpaRepository<User, Integer> {

}

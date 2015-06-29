/**
 * 
 */
package com.devheure.microservices.svcmanageuser.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devheure.microservices.svcmanageuser.model.User;

/**
 * @author throdo
 *
 */
public interface IUserRepository extends JpaRepository<User, Integer> {

}

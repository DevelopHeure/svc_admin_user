package com.devheure.microservices.svcmanageuser.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.devheure.microservices.svcmanageuser.dao.IUserRepository;
import com.devheure.microservices.svcmanageuser.model.User;

/**
 * Created by Hervé Darritchon on 28/06/15.
 */
@RestController
@RequestMapping(path = "/users")
public class UserApplicationCtrl {

	@Autowired
	private IUserRepository repository;

	@RequestMapping(path = "", method = RequestMethod.GET)
	public List<User> listAllUsers() {
		return repository.findAll();
	}
}

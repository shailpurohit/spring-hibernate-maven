package com.sample.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sample.model.Status;
import com.sample.model.User;
import com.sample.services.UserServices;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserServices userServices;

	static final Logger logger = Logger.getLogger(RestController.class);

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public @ResponseBody
	List<User> getUser() {
		List<User> userList = null;
		try {
			userList = userServices.getEntityList();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return userList;
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public @ResponseBody
	User getUser(@PathVariable("id") int id) {
		User user = null;
		try {
			user = userServices.getEntityById(id);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.POST, consumes = "application/json")
	public @ResponseBody
	Status addUser(@RequestBody User user) {
		try {
			userServices.addEntity(user);
			return new Status(1, "Employee added Successfully !");
		} catch (Exception e) {
			// e.printStackTrace();
			return new Status(0, e.toString());
		}

	}
	
	@RequestMapping(value = "delete/{id}", method = RequestMethod.GET)
	public @ResponseBody
	Status deleteUser(@PathVariable("id") int id) {
		try {
			userServices.deleteEntity(id);
			return new Status(1, "User deleted Successfully !");
		} catch (Exception e) {
			return new Status(0, e.toString());
		}
	}
	
}

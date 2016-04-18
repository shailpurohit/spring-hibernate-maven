package com.cybage.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cybage.dao.UserDao;
import com.cybage.model.User;

public class UserServicesImpl implements UserServices {

	@Autowired
	UserDao userDao;

	@Override
	public boolean addEntity(User user) throws Exception {
		return userDao.addEntity(user);
	}

	@Override
	public User getEntityById(int id) throws Exception {
		return userDao.getEntityById(id);
	}

	@Override
	public List<User> getEntityList() throws Exception {
		return userDao.getEntityList();
	}

	@Override
	public boolean deleteEntity(int id) throws Exception {
		return userDao.deleteEntity(id);
	}

}

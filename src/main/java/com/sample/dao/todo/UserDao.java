package com.sample.dao.todo;

import java.util.List;

import com.sample.model.todo.User;

public interface UserDao {

	public boolean addEntity(User user) throws Exception;
	public User getEntityById(int id) throws Exception;
	public List<User> getEntityList() throws Exception;
	public boolean deleteEntity(int id) throws Exception;
}

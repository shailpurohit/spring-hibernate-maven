package com.cybage.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cybage.dao.TodoDao;
import com.cybage.model.Todo;

public class TodoServicesImpl implements TodoServices {

	@Autowired
	TodoDao todoDao;

	@Override
	public boolean addEntity(Todo todo) throws Exception {
		return todoDao.addEntity(todo);
	}

	@Override
	public Todo getEntityById(int id) throws Exception {
		return todoDao.getEntityById(id);
	}

	@Override
	public List<Todo> getEntityList() throws Exception {
		return todoDao.getEntityList();
	}

	@Override
	public boolean deleteEntity(int id) throws Exception {
		return todoDao.deleteEntity(id);
	}

	@Override
	public boolean updateEntity(int id, Todo todo) throws Exception {
		// TODO Auto-generated method stub
		return todoDao.updateEntity(id, todo);
	}

}

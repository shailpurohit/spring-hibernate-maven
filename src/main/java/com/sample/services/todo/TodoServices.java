package com.sample.services.todo;

import java.util.List;

import com.sample.model.todo.Todo;

public interface TodoServices {
	public boolean addEntity(Todo todo) throws Exception;
	public Todo getEntityById(int id) throws Exception;
	public List<Todo> getEntityList() throws Exception;
	public boolean deleteEntity(int id) throws Exception;
	public boolean updateEntity(int id, Todo todo) throws Exception;
}

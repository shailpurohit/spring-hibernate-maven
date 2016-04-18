package com.sample.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import com.sample.model.Todo;

public class TodoDaoImpl implements TodoDao {

	@Autowired
	SessionFactory sessionFactory;

	Session session = null;
	Transaction tx = null;

	@Override
	public boolean addEntity(Todo todo) throws Exception {
		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		session.save(todo);
		tx.commit();
		session.close();
		return false;
	}

	@Override
	public Todo getEntityById(int id) throws Exception {
		session = sessionFactory.openSession();
		Todo todo = (Todo) session.load(Todo.class,
				id);
		tx = session.getTransaction();
		session.beginTransaction();
		tx.commit();
		return todo;
	}

	
	@SuppressWarnings("unchecked")
	@Override
	public List<Todo> getEntityList() throws Exception {
		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		List<Todo> todoList = session.createCriteria(Todo.class)
				.list();
		tx.commit();
		return todoList;
	}

	@Override
	public boolean deleteEntity(int id) throws Exception {
		session = sessionFactory.openSession();
		Object o = session.load(Todo.class, id);
		tx = session.getTransaction();
		session.beginTransaction();
		session.delete(o);
		tx.commit();
		return false;
	}

	@Override
	public boolean updateEntity(int id, Todo todo) throws Exception {
		session = sessionFactory.openSession();
		Todo updateTodo = (Todo) session.load(Todo.class,
				id);
		if (todo.getTitle() != null && !updateTodo.getTitle().equals(todo.getTitle()))
			updateTodo.setTitle(todo.getTitle());
		if (updateTodo.isComplete() != todo.isComplete())
			updateTodo.setComplete(todo.isComplete());
		
		session.update(updateTodo);
		tx = session.getTransaction();
		session.beginTransaction();
		tx.commit();
		return false;
	}
	
	

}

package com.cybage.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import com.cybage.model.User;

public class UserDaoImpl implements UserDao {

	@Autowired
	SessionFactory sessionFactory;

	Session session = null;
	Transaction tx = null;

	@Override
	public boolean addEntity(User user) throws Exception {
		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		session.save(user);
		tx.commit();
		session.close();
		return false;
	}

	@Override
	public User getEntityById(int userCode) throws Exception {
		session = sessionFactory.openSession();
		User user = (User) session.load(User.class,
				userCode);
		tx = session.getTransaction();
		session.beginTransaction();
		tx.commit();
		return user;
	}

	
	@SuppressWarnings("unchecked")
	@Override
	public List<User> getEntityList() throws Exception {
		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		List<User> userList = session.createCriteria(User.class)
				.list();
		tx.commit();
		return userList;
	}

	@Override
	public boolean deleteEntity(int id) throws Exception {
		session = sessionFactory.openSession();
		Object o = session.load(User.class, id);
		tx = session.getTransaction();
		session.beginTransaction();
		session.delete(o);
		tx.commit();
		return false;
	}
	
	

}

package com.cybage.services;

import java.util.List;

import com.cybage.model.Employee;

public interface DataServices {
	public boolean addEntity(Employee employee) throws Exception;
	public Employee getEntityById(long id) throws Exception;
	public List<Employee> getEntityList() throws Exception;
	public boolean deleteEntity(long id) throws Exception;
}

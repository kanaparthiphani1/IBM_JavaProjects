package com.example.demo.dao;

import java.util.List;

import com.example.demo.model.Employee;

public interface EmployeeDao {

	
	public List<Employee> displayAll();
	public Employee createEmployee(Employee e);
}

package com.example.demo.Service;

import java.util.List;

import com.example.demo.model.Employee;

public interface EmployeeService {

	
	public List<Employee> displayAll();
	public Employee createEmployee(Employee e);
	public Employee findByid(int id);
	public void delete(Employee e);
}

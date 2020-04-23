package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EmployeeDao;
import com.example.demo.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;
	@Override
	public List<Employee> displayAll() {
		// TODO Auto-generated method stub
		return employeeDao.displayAll();
	}

	@Override
	public Employee createEmployee(Employee e) {
		// TODO Auto-generated method stub
		return employeeDao.createEmployee(e);
	}

	@Override
	public Employee findByid(int id) {
		// TODO Auto-generated method stub
		return employeeDao.findByid(id);
	}

	@Override
	public void delete(Employee e) {
		// TODO Auto-generated method stub
		employeeDao.delete(e);
	}

}

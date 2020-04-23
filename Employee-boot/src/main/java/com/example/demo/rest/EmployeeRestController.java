package com.example.demo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.EmployeeDao;
import com.example.demo.model.Employee;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

	private EmployeeDao employeeDao;

	@Autowired
	public EmployeeRestController(EmployeeDao employeeDao) {
		super();
		this.employeeDao = employeeDao;
	}
	
	@GetMapping("/employees")
	public List<Employee> showAll()
	{
		return employeeDao.displayAll();
	}
	@PostMapping("/employees")
	public Employee add(@RequestBody Employee e)
	{
		return employeeDao.createEmployee(e);
	}
}

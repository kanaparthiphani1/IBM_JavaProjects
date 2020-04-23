package com.example.demo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.EmployeeService;
import com.example.demo.dao.EmployeeDao;
import com.example.demo.model.Employee;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/api")
@Api(value = "Employee Management System", description = "Operations that are in Management System")
public class EmployeeRestController {

	private EmployeeService employeeService;

	@Autowired
	public EmployeeRestController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	
	@ApiOperation(value = "View a list of available employees", response = List.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Successfully retrieved list"),
			@ApiResponse(code = 401, message = "You are not authorized to view the resource"),
			@ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code = 404, message = "The resource you were trying to reach is not found") 
	})
	@GetMapping("/employees")
	public List<Employee> showAll()
	{
		return employeeService.displayAll();
	}
	
	@ApiOperation(value = "Add an EMPLOYEE", response = Employee.class)
	@PostMapping("/employees")
	public Employee add(@ApiParam(value="Employee obj gto store in db",required = true) @RequestBody Employee e)
	{
		return employeeService.createEmployee(e);
	}
	
	@ApiOperation(value = "Display an EMPLOYEE by id", response = Employee.class)
	@GetMapping("/employee/{id}")
	public Employee showbyId(@ApiParam(value="Employee id to search in db",required = true) @PathVariable int id)
	{
		return employeeService.findByid(id);
	}
	
	@ApiOperation(value = "Update an EMPLOYEE", response = Employee.class)
	@PutMapping("/employees")
	public Employee update(@ApiParam(value="Employee obj to update in db",required = true) @RequestBody Employee e)
	{
		return employeeService.createEmployee(e);
	}
	
	@ApiOperation(value = "delete an EMPLOYEE", response = Employee.class)
	@DeleteMapping("/employee/{id}")
	public Employee delete(@ApiParam(value="Employee id to delete in db",required = true) @PathVariable int id)
	{
		Employee emp = employeeService.findByid(id);
		employeeService.delete(emp);
		return emp;
	}
	
}

package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Dao.UsersDao;
import com.example.demo.model.Employee;
import com.example.demo.model.Users;


@RestController
public class EmployeeController {

	@Autowired
	private UsersDao usersDao;
	@Autowired
	private JdbcUserDetailsManager jdbcUserDetailsManager;
	
	
	  @GetMapping("/user/showall") 
	  public List<Employee> showall() 
	  { Iterator<Employee>it=usersDao.findAll().iterator();
	  List<Employee> li=new ArrayList<Employee>();
	  while(it.hasNext()) 
	  { li.add(it.next()); } 
	  return li; 
	  }
	  
	  @GetMapping("/showEmployeebyId") 
	  public Employee showbyname(Employee e) 
	  {
		  
		  return usersDao.findById(e.getId()).get();
	  }
	  
	  
	  @PostMapping("/register-employee")
	  public String createEmployee(Employee e)
	  {
		  usersDao.save(e);
		  return "success";
	  }
	  
	 
		/*
		 * @RequestMapping("/admin") public String adminlogin() {
		 * 
		 * System.out.println("bye");
		 * 
		 * return "hi"; }
		 */
}

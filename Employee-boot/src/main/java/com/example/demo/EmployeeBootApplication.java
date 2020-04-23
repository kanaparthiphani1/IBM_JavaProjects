package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.example.demo.dao.EmployeeDao;
import com.example.demo.model.Employee;

@SpringBootApplication
@ComponentScan(basePackages = "com.example")
public class EmployeeBootApplication {

	@Autowired
	private EmployeeDao employeeDao;
	/*
	 * @Autowired public EmployeeBootApplication(EmployeeDao employeeDao) { super();
	 * this.employeeDao = employeeDao; }
	 */

	public static void main(String[] args) {
		SpringApplication.run(EmployeeBootApplication.class, args);
	}

	

}

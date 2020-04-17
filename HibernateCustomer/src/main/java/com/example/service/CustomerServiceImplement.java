package com.example.service;

import java.util.List;

import com.example.dao.CustomerDaoImplement;
import com.example.domain.Customer;

public class CustomerServiceImplement implements CustomerService {

	CustomerDaoImplement customerDao;
	
	{
		customerDao= new CustomerDaoImplement();
	}
	
	public Customer createService(Customer customer) {
		return customerDao.create(customer);
	}

	public List<Customer> listAllService() {
		return customerDao.listAll();
	}

	public Customer getCustomerByIDService(String customerId) {
		return customerDao.getCustomerByID(customerId);
	}

	public Customer updateCustomerByIdService(String customerId, Customer customer) {
		// TODO Auto-generated method stub
		return customerDao.updateCustomerById(customerId, customer);
	}

	public Customer updateCustomerByName(String customerName, Customer customer) {
		// TODO Auto-generated method stub
		return customerDao.updateCustomerByName(customerName, customer);
	}

	public void addCourseService(String customerId, List<String> list) {
		
		customerDao.addCourse(customerId, list);
	}

}

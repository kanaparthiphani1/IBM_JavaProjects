package com.example.service;

import java.util.List;

import com.example.domain.Customer;

public interface CustomerService {

	public Customer createService(Customer customer);
	
	public List<Customer> listAllService();
	
	public Customer getCustomerByIDService(String customerId);
	
	public Customer updateCustomerByIdService(String customerId,Customer customer);

	public Customer updateCustomerByName(String customerName,Customer customer);
	
	public void addCourseService(String customerId,List<String> list);
}

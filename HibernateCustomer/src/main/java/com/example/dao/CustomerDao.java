package com.example.dao;

import java.util.List;

import com.example.domain.Customer;

public interface CustomerDao {
	
	public Customer create(Customer customer);
	
	public List<Customer> listAll();

	public Customer getCustomerByID(String customerId);
	
	public Customer updateCustomerById(String customerId,Customer customer);
	
	public Customer updateCustomerByName(String customerName,Customer customer);
	
	public void addCourse(String customerId,List<String> list);
}

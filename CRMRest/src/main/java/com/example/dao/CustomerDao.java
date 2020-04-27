package com.example.dao;

import java.util.List;

import com.example.entity.Customer;

public interface CustomerDao {


	  public List<Customer> getCustomers();
	  
	  public Customer getCustomer(int theId);
	  
	  public void saveCustomer(Customer theCustomer);
	  
	  public void deleteCustomer(Customer customer);
		 
}


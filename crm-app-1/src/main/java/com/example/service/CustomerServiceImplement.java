package com.example.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.dao.CustomerDao;
import com.example.entity.Customer;

@Service
public class CustomerServiceImplement implements CustomerService {

	
	@Autowired
	CustomerDao customerDao;
	
	

	public List<Customer> getCustomers() {
		
		return customerDao.getCustomers();
	}


	@Override

	public Customer getCustomer(int theId) {
		// TODO Auto-generated method stub
		return customerDao.getCustomer(theId);
	}


	@Override

	public void saveCustomer(Customer theCustomer) {
		customerDao.saveCustomer(theCustomer);
	}


	@Override
	public void deleteCustomer(Customer c) {
		// TODO Auto-generated method stub
		customerDao.deleteCustomer(c);
	}


}

package com.example.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.entity.Customer;

@Repository
public class CustomerDaoImplement implements CustomerDao{

	@Autowired
	private SessionFactory sessionFactory;
			
	@Override
	public List<Customer> getCustomers() {
		
		// get the current hibernate session
		Session currentSession = sessionFactory.openSession();
				
		// create a query  ... sort by last name
		Query<Customer> theQuery = 
				currentSession.createQuery("from Customer",
											Customer.class);
		
		// execute query and get result list
		List<Customer> customers = theQuery.getResultList();
				
		// return the results		
		return customers;
	}

	@Override
	public Customer getCustomer(int theId) {
		Session currentSession = sessionFactory.openSession();
		return currentSession.get(Customer.class, theId);
		
	}

	@Override
	public void saveCustomer(Customer theCustomer) {
		Session currentSession = sessionFactory.openSession();
		currentSession.getTransaction().begin();
		currentSession.saveOrUpdate(theCustomer);
		currentSession.getTransaction().commit();
		
	}

	@Override
	public void deleteCustomer(Customer customer) {
		Session currentSession = sessionFactory.openSession();
		currentSession.getTransaction().begin();
		
		currentSession.delete(customer);
		currentSession.getTransaction().commit();
		
	}
	
	
}

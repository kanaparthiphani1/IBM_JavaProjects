package com.example.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.example.domain.Customer;
import com.example.domain.Course;
import com.example.factory.HibernateFactory;

public class CustomerDaoImplement implements CustomerDao{

	private  HibernateFactory factory=null;
	private SessionFactory sessionFactory=null;
	private Session session=null;
	
	{
		try {
			factory=HibernateFactory.getMyHibernateFactory();
			sessionFactory=factory.getSessionFactory();
			session=sessionFactory.openSession();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//session=sessionFactory.getCurrentSession();
	}

	public Customer create(Customer customer) {
		try {
			session.getTransaction().begin();
			session.save(customer);
			session.getTransaction().commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return customer;
	}

	public List<Customer> listAll() {
		session.getTransaction().begin();
		List<Customer> list = session.createQuery("from Customer", Customer.class).list();
		session.getTransaction().commit();
		return list;
	}
	
	public Customer getCustomerByID(String customerId) {
		
		return session.get(Customer.class, customerId);
	}
	
	public Customer updateCustomerById(String customerId,Customer customer)
	{
		session.update(customerId,customer);
		return customer;
	}
	
	public Customer updateCustomerByName(String customerName,Customer customer)
	{
		session.update(customerName,customer);
		return customer;
	}
	
	public void addCourse(String customerId,List<String> list) {
		
		session.getTransaction().begin();
		Customer customer= session.get(Customer.class, customerId);
		Iterator<String> iter = list.iterator();
		
		while(iter.hasNext())
		{
			Course course= new Course(iter.next());
			customer.add(course);
			session.save(course);
			
		}
		session.getTransaction().commit();
		
		
	
	}



}

package com.example.factory;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.example.domain.Course;
import com.example.domain.Customer;
import com.example.domain.Project;

public class HibernateFactory {

	private SessionFactory sessionFactory;

	private static HibernateFactory factory;

	private HibernateFactory() {

	}

	public SessionFactory getSessionFactory()
	{
		sessionFactory=new Configuration().configure().addAnnotatedClass(Customer.class).addAnnotatedClass(Project.class).addAnnotatedClass(Course.class).buildSessionFactory();
		return sessionFactory;
	}
	
	public static HibernateFactory getMyHibernateFactory()
	{
		if(factory==null)
		{
			factory=new HibernateFactory();
		}
		return factory;
	}
}

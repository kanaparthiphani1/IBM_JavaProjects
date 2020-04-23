package com.example.demo.dao;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.example.demo.model.Employee;

@Repository(value = "employeeDao")
@EnableTransactionManagement
public class EmployeeDaoImpl implements EmployeeDao {

	private EntityManager entityManager;
	
	@Autowired
	public EmployeeDaoImpl(EntityManager entityManager) {
			super();
			this.entityManager = entityManager;
		}
	
	
	@Override
	public List<Employee> displayAll() {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		Query qry=session.createQuery("from Employee",Employee.class);
		return qry.getResultList();
	}
	

	@Override
	@Transactional
	public Employee createEmployee(Employee e) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(e);
		return e;
	}

}

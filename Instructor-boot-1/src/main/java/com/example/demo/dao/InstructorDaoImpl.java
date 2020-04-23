package com.example.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Instructor;

@Repository
public class InstructorDaoImpl implements InstructorDao {

	@Autowired
	private EntityManager entityManagrer;
	
	@Override
	public List<Instructor> showAll() {
		// TODO Auto-generated method stub
		Session sesion = entityManagrer.unwrap(Session.class);
		Query qry=sesion.createQuery("from Instructor i",Instructor.class);
		
		return qry.getResultList();
	}

	@Override
	public void createInstructor(Instructor i) {
		// TODO Auto-generated method stub
		Session sesion = entityManagrer.unwrap(Session.class);
		sesion.getTransaction().begin();
		sesion.saveOrUpdate(i);
		sesion.getTransaction().commit();
	}

	@Override
	public Instructor getById(int i) {
		// TODO Auto-generated method stub
		Session sesion = entityManagrer.unwrap(Session.class);

		return 		sesion.get(Instructor.class,i);

	}

	@Override
	public void deleteById(Instructor i) {
		// TODO Auto-generated method stub
		Session sesion = entityManagrer.unwrap(Session.class);
		sesion.getTransaction().begin();
		sesion.delete(i);
		sesion.getTransaction().commit();
	}

}

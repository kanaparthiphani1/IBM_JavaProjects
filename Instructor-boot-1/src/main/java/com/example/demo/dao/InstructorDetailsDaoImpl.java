package com.example.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Instructor;
import com.example.demo.model.InstructorDetails;

@Repository
public class InstructorDetailsDaoImpl implements InstructorDetailsDao {
	@Autowired
	private EntityManager entityManagrer;
	@Override
	public List<InstructorDetails> showAll() {
		// TODO Auto-generated method stub
		Session sesion = entityManagrer.unwrap(Session.class);
		Query qry=sesion.createQuery("from InstructorDetails i",InstructorDetails.class);
		
		return qry.getResultList();
	}

	@Override
	public void createInstructor(InstructorDetails i) {
		// TODO Auto-generated method stub
		Instructor obj= i.getInstructor_id();
		obj.setDetails(i);
		Session sesion = entityManagrer.unwrap(Session.class);
		sesion.getTransaction().begin();
		
		
		sesion.saveOrUpdate(obj);
		sesion.getTransaction().commit();
	}

	@Override
	public InstructorDetails getById(int i) {
		// TODO Auto-generated method stub
		Session sesion = entityManagrer.unwrap(Session.class);

		return 		sesion.get(InstructorDetails.class,i);
	}

	@Override
	public void deleteById(InstructorDetails i) {
		// TODO Auto-generated method stub
		Session sesion = entityManagrer.unwrap(Session.class);
		sesion.getTransaction().begin();
		sesion.delete(i);
		sesion.getTransaction().commit();
	}

}

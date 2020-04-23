package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.InstructorDao;
import com.example.demo.model.Instructor;

@Service
public class InstructorServiceImpl implements InstructorService {

	@Autowired
	private InstructorDao instructorDao;
	
	@Override
	public List<Instructor> showAll() {
		// TODO Auto-generated method stub
		return instructorDao.showAll();
	}

	@Override
	public void createInstructor(Instructor i) {
		// TODO Auto-generated method stub
		instructorDao.createInstructor(i);
	}

	@Override
	public Instructor getById(int i) {
		// TODO Auto-generated method stub
		return instructorDao.getById(i);
	}

	@Override
	public void deleteById(Instructor i) {
		// TODO Auto-generated method stub
		instructorDao.deleteById(i);
	}
	
	

}

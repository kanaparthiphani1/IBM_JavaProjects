package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.InstructorDao;
import com.example.demo.dao.InstructorDetailsDao;
import com.example.demo.model.InstructorDetails;

@Service
public class InstructorDetailsServiceImpl implements InstructorDetailsService{
	@Autowired
	private InstructorDetailsDao instructorDao;
	@Override
	public List<InstructorDetails> showAll() {
		// TODO Auto-generated method stub
		return instructorDao.showAll();
	}

	@Override
	public void createInstructor(InstructorDetails i) {
		// TODO Auto-generated method stub
		instructorDao.createInstructor(i);
	}

	@Override
	public InstructorDetails getById(int i) {
		// TODO Auto-generated method stub
		return instructorDao.getById(i);
	}

	@Override
	public void deleteById(InstructorDetails i) {
		// TODO Auto-generated method stub
		instructorDao.deleteById(i);
	}

}

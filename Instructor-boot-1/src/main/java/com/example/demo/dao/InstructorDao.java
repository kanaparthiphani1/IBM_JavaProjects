package com.example.demo.dao;

import java.util.List;

import com.example.demo.model.Instructor;

public interface InstructorDao {
	public List<Instructor> showAll();
	
	public void createInstructor(Instructor i);

	public Instructor getById(int i);
	
	public void deleteById(Instructor i);
}

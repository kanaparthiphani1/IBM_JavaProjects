package com.example.demo.dao;

import java.util.List;

import com.example.demo.model.Instructor;
import com.example.demo.model.InstructorDetails;

public interface InstructorDetailsDao {
  public List<InstructorDetails> showAll();
	
	public void createInstructor(InstructorDetails i);

	public InstructorDetails getById(int i);
	
	public void deleteById(InstructorDetails i);
}

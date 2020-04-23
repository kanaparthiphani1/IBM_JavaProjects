package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Instructor;
import com.example.demo.model.InstructorDetails;

public interface InstructorDetailsService {
	public List<InstructorDetails> showAll();
	public void createInstructor(InstructorDetails i);
	public InstructorDetails getById(int i);
	public void deleteById(InstructorDetails i);
}

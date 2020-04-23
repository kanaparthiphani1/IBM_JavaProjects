package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Instructor;

public interface InstructorService {
	public List<Instructor> showAll();
	public void createInstructor(Instructor i);
	public Instructor getById(int i);
	public void deleteById(Instructor i);
}

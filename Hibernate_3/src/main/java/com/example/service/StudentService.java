package com.example.service;

import java.util.List;

import com.example.domain.Student;

public interface StudentService {

	public Student createStudent(Student student);
	public List<Student> getAllStudent();
	public Student getStudentByID(String studnetID);
}

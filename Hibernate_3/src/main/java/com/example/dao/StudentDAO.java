package com.example.dao;

import java.util.List;

import com.example.domain.Student;

public interface StudentDAO {
	
	public Student createStudent(Student student);
	public List<Student> getAllStudent();
	public Student getStudentByID(String studnetID);

}

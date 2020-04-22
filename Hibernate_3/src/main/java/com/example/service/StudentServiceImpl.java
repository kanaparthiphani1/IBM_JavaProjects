package com.example.service;

import java.util.List;

import com.example.dao.StudentDAO;
import com.example.dao.StudentDAOImpl;
import com.example.domain.Student;

public class StudentServiceImpl implements StudentService {

	private StudentDAO dao;
	
	{
		dao=new StudentDAOImpl();
	}
	public Student createStudent(Student student) {
		// TODO Auto-generated method stub
		return dao.createStudent(student);
	}

	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return dao.getAllStudent();
	}

	public Student getStudentByID(String studnetID) {
		// TODO Auto-generated method stub
		return dao.getStudentByID(studnetID);
	}

}

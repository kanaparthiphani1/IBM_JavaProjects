package com.example.demo.Service;

import java.util.List;

import com.example.demo.model.School;

public interface StudentService {

	public List<School> showall();
	public List<School> showBySchool(String school);
}

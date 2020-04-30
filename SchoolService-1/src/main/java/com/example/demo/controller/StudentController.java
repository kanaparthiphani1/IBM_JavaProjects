package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.StudentService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class StudentController {

	private StudentService studentService;
	
	@GetMapping("show/{name}")
	public List show(@PathVariable String name)
	{
		return studentService.showBySchool(name);
	}
}

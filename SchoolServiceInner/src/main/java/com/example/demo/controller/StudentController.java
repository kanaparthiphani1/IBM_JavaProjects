package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.StudentService;
import com.example.demo.model.School;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@RestController
@AllArgsConstructor
public class StudentController {

	
	private StudentService studentService;
	
	
	@GetMapping("/hi")
	public String hi()
	{
		return "HI";
	}
	@GetMapping("/showall")
	public List<School> showall()
	{
		return studentService.showall();
	}
	
	@GetMapping("/show/{name}")
	public List<School> showbySchool(@PathVariable String name)
	{
		return studentService.showBySchool(name);
	}
	
}

package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class StudentService {

	@Autowired
	RestTemplate restTemplate;
	
	
	
	public List showBySchool(String name)
	{
		return restTemplate.getForObject("http://service-student/show/"+name, List.class);
	}
}

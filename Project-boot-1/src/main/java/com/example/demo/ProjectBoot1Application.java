package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.DAO.ProjectDao;

@SpringBootApplication
public class ProjectBoot1Application {

	private ProjectDao projectDao;
	
	
	public ProjectBoot1Application(ProjectDao projectDao) {
		super();
		this.projectDao = projectDao;
	}


	public static void main(String[] args) {
		SpringApplication.run(ProjectBoot1Application.class, args);
	}

}

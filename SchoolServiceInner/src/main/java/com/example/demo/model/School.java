package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity(name = "school")
@Data
public class School {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int rollno;
	@Column(name="name")
	private String studentName;
	@Column(name="class")
	private String studentClass;
	@Column(name="schoolname")
	private String studentSchool;
	public School(String studentName, String studentClass, String studentSchool) {
		super();
		this.studentName = studentName;
		this.studentClass = studentClass;
		this.studentSchool = studentSchool;
	}
}

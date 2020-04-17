package com.example.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


import lombok.Data;


@Entity
@Data
@Table(name ="customer")
public class Customer implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 917606022899856201L;
	
	
	@Id
	String customerId;
	String customerName;
	String customerEmail;
	Boolean isActive;
	
	@OneToOne(cascade=CascadeType.ALL,targetEntity= com.example.domain.Project.class)
	@JoinColumn(name="projectId")
	private Project customerProject;


	@OneToMany(mappedBy = "customer", cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH,
			CascadeType.REFRESH })
	private List<Course> courses;
	
	public void add(Course tempCourse) {

		if (courses == null) {
			courses = new ArrayList<Course>();
		}

		courses.add(tempCourse);

		tempCourse.setCustomer(this);
	}

}

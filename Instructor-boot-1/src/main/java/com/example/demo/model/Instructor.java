package com.example.demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "instructor")
public class Instructor {

	@Override
	public String toString() {
		return "Instructor [id=" + id + ", name=" + name + ", email=" + email + ", details=" + details + "]";
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "email")
	private String email;
	@JsonManagedReference
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="instructor_detail_id")
	private InstructorDetails details;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public InstructorDetails getDetails() {
		return details;
	}
	public void setDetails(InstructorDetails details) {
		this.details = details;
	}
	public Instructor() {
		super();
	}
	public Instructor(int id, String name, String email, InstructorDetails details) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.details = details;
	}
}

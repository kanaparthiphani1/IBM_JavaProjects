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

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "instructor_details")
public class InstructorDetails {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	

	@JsonBackReference
	@OneToOne(mappedBy="details", 
			cascade=CascadeType.ALL)
	private Instructor instructor_id;
	public Instructor getInstructor_id() {
		return instructor_id;
	}
	public void setInstructor_id(Instructor instructor_id) {
		this.instructor_id = instructor_id;
	}
	public InstructorDetails(int id, Instructor instructor_id, String state, String city, String country) {
		super();
		this.id = id;
		this.instructor_id = instructor_id;
		this.state = state;
		this.city = city;
		this.country = country;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public InstructorDetails(int id, String state, String city, String country) {
		super();
		this.id = id;
		this.state = state;
		this.city = city;
		this.country = country;
	}
	@Column(name = "state")
	private String state;
	@Column(name = "city")
	private String city;
	@Column(name = "country")
	private String country;
	public InstructorDetails(String state, String city, String country) {
		super();
		this.state = state;
		this.city = city;
		this.country = country;
	}
	public InstructorDetails() {
		super();
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	

}

package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.ToString;

@Entity
@ToString
public class Project {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String name;
	@Column
	private String author;
	@Column
	private String description;
	public Project(int id, String name, String author, String description) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.description = description;
	}
	public Project() {
		super();
	}
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
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Project(String name, String author, String description) {
		super();
		this.name = name;
		this.author = author;
		this.description = description;
	}
	public Project(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}
	
	
	
}

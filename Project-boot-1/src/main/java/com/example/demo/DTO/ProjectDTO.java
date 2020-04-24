package com.example.demo.DTO;

public class ProjectDTO {

	private String name;
	private String description;
	private String author;
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public ProjectDTO(String name, String description, String author) {
		super();
		this.name = name;
		this.description = description;
		this.author = author;
	}
	public ProjectDTO() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public ProjectDTO(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}
}

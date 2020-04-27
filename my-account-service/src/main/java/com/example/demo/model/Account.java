package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
@Data
public class Account {

	public Account(String id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int acc_no;
	@Column
	private String id;
	@Column
	private String name;
	@Column
	private String description;
	public Account(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}
}

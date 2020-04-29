package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
public class Users {


	
	private String userName;
	private String password;
	private String roles;

	public Users() {

	}

	public Users(String userName, String password, String roles) {
		super();
		this.userName = userName;
		this.password = password;
		this.roles = roles;
	}
}

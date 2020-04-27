package com.example.demo;

import lombok.Setter;

@Setter
public class NameImplement implements Name{

	private Address objAddress;
	
	public String displayName() {
		return "Shyam";
	}

	public String displayAddress() {
		return objAddress.displayAddress();
	}

	
}

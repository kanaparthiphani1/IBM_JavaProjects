package com.example.demo.SpringMavenCustomer;

import lombok.ToString;

@ToString
public class Customer {
	private String customerID;
	private String customerName;
	private Address address;
	
	public Customer(String customerName, Address address) {
	
		this.customerName = customerName;
		this.address = address;
	}

	public Customer() {
		super();
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}
	
	
	

}
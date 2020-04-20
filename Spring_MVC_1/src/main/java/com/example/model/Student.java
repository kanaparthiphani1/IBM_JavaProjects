package com.example.model;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Student {

	private String id;
	private String firstName;
	private String lastName;
	private String email;
	private String country;
	private LinkedHashMap<String, String> countryOptions=null;
	private String favouritelanguage;
	private String[] operatingSystems;
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}
	public void setCountryOptions(LinkedHashMap<String, String> countryOptions) {
		this.countryOptions = countryOptions;
	}
	public String getFavouritelanguage() {
		return favouritelanguage;
	}
	public void setFavouritelanguage(String favouritelanguage) {
		this.favouritelanguage = favouritelanguage;
	}
	public String[] getOperatingSystems() {
		return operatingSystems;
	}
	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}
	public Student(String id, String firstName, String lastName, String email, String country,
			LinkedHashMap<String, String> countryOptions, String favouritelanguage, String[] operatingSystems) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.country = country;
		this.countryOptions = countryOptions;
		this.favouritelanguage = favouritelanguage;
		this.operatingSystems = operatingSystems;
	}
	public Student(String id, String firstName, String lastName, String email) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	public Student() {
countryOptions = new LinkedHashMap<String, String>();
		
		countryOptions.put("BR", "Brazil");
		countryOptions.put("FR", "France");
		countryOptions.put("DE", "Germany");
		countryOptions.put("IN", "India");
		countryOptions.put("US", "United States of America");	
		
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	};
	
}

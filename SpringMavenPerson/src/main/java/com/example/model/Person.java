package com.example.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
public class Person {
	private String name= "Shyam";
	private int age= 20;
	private float height= 5.11f;
	private boolean isProgrammer=true;
	private Address address;
	
	public String addresInfo()
	{
		return "Street number :- "+address.getStreetNumber()+"\n Street Name :- "+address.getStreetName()+" \n City :- "+address.getCity()+" \n Country :- "+address.getCountry();
	}

}

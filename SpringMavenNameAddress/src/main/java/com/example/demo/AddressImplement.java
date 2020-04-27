package com.example.demo;

import java.util.Formattable;
import java.util.Formatter;

import lombok.Setter;

@Setter
public class AddressImplement  implements Address,Formattable{
	
	private AddressImplement obj;

	public void formatTo(Formatter formatter, int flags, int width, int precision) {
		// TODO Auto-generated method stub
		
	}
	
	public String displayAddress() {
		return "Telangana";
	}

	
	

}

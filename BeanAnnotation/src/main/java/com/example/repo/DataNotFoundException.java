package com.example.repo;

public class DataNotFoundException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DataNotFoundException()
	{
		super("Entered Value is not in the database");
	}
}

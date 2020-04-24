package com.example.demo.Exception;

public class ProjectNotFoundException extends Throwable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String message;

	public ProjectNotFoundException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}

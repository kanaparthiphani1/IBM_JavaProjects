package com.example.demo.exception;

public class InstructorNotFound extends Throwable {

	private String message;

	public InstructorNotFound(String message) {
		super();
		this.message = message;
	}

	public InstructorNotFound() {
		super();
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}

package com.example.rest.exception;

public class CustomerNotFoundException extends Throwable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1873110004928596074L;
	
	private String message;

	public CustomerNotFoundException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "CustomerNotFoundException [message=" + message + "]";
	}
	


}

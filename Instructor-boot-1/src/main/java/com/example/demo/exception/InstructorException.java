package com.example.demo.exception;

public class InstructorException {

	private String status;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public long getTimesatmp() {
		return timesatmp;
	}
	public void setTimesatmp(long timesatmp) {
		this.timesatmp = timesatmp;
	}
	public InstructorException() {
		super();
	}
	public InstructorException(String status, String message, long timesatmp) {
		super();
		this.status = status;
		this.message = message;
		this.timesatmp = timesatmp;
	}
	private String message;
	private long timesatmp;
}

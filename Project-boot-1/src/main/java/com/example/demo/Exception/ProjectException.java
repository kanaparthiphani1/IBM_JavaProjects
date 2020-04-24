package com.example.demo.Exception;

public class ProjectException {
	private String status;
	private String message;
	private long timestamp;
	public ProjectException(String status, String message, long timestamp) {
		super();
		this.status = status;
		this.message = message;
		this.timestamp = timestamp;
	}
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
	public long getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}
	

}

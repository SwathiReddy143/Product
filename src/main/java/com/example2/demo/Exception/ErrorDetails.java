package com.example2.demo.Exception;

import java.util.Date;

public class ErrorDetails {
	private Date timestamp;
	private String message;
	private String detials;
	
	public ErrorDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ErrorDetails(Date timestamp, String message, String detials) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.detials = detials;
	}
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDetials() {
		return detials;
	}
	public void setDetials(String detials) {
		this.detials = detials;
	}
	

}

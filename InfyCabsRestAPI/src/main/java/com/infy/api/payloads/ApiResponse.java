package com.infy.api.payloads;

public class ApiResponse {

	private String message;
	private String id;
	public ApiResponse(String message, String id) {
		super();
		this.message = message;
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
}

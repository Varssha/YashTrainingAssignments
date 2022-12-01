package com.demo.exception_1;

public class ResultException extends RuntimeException {
	
	private String message;
	

	public ResultException(String message) {
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

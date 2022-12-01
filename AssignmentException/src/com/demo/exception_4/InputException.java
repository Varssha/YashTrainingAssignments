package com.demo.exception_4;

public class InputException extends RuntimeException{
	String message;
	
	public InputException(String message) {
		super(message);
	}

}

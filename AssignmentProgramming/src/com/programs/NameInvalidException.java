package com.programs;

public class NameInvalidException  extends Exception{

	String message;

	public NameInvalidException(String message) {
		super();
		this.message = message;
	}
	
	
}

package com.demo.exception_5;

public class TicketBookingEception extends RuntimeException{
	
	String message;
	
	public TicketBookingEception(String message) {
		super(message);
	}

}

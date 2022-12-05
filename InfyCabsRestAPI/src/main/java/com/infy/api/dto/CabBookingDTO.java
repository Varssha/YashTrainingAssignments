package com.infy.api.dto;

import java.time.LocalDate;

public class CabBookingDTO {

	
	private int bookingId;
	private String source;
	private String destination;
	private double fare;
	private LocalDate travelDate;
	private long usermobile; 
	private String status;
	
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public double getFare() {
		return fare;
	}
	public void setFare(double fare) {
		this.fare = fare;
	}
	public LocalDate getTravelDate() {
		return travelDate;
	}
	public void setTravelDate(LocalDate travelDate) {
		this.travelDate = travelDate;
	}
	public long getUsermobile() {
		return usermobile;
	}
	public void setUsermobile(long usermobile) {
		this.usermobile = usermobile;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "CabBookingDTO [bookingId=" + bookingId + ", source=" + source + ", destination=" + destination
				+ ", fare=" + fare + ", travelDate=" + travelDate + ", usermobile=" + usermobile + ", status=" + status
				+ "]";
	}
	
	
	
}

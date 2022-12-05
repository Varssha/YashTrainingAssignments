package com.infy.api.service;

import java.util.List;

import com.infy.api.dto.CabBookingDTO;
import com.infy.api.exception.CabBookingException;

public interface BookingService {

	public Integer bookCab(CabBookingDTO cabBookingdto);

	public List<CabBookingDTO> getDetails(long mobileNo);

	public void cancelBooking(Integer bookingId) throws CabBookingException;
	
	
}

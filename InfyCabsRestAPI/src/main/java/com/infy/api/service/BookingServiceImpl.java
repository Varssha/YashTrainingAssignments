package com.infy.api.service;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.infy.api.dto.CabBookingDTO;
import com.infy.api.entities.CabBooking;
import com.infy.api.exception.CabBookingException;
import com.infy.api.repository.BookingRepository;


@Service
public class BookingServiceImpl implements BookingService {

	@Autowired
	BookingRepository bookingRepository;

	@Autowired
	ModelMapper modelMapper;

	@Override
	public Integer bookCab(CabBookingDTO cabBookingdto) {
		CabBooking bookcab = this.modelMapper.map(cabBookingdto, CabBooking.class);
		CabBooking savedbookcab = bookingRepository.save(bookcab);

		return savedbookcab.getBookingId();
	}

	@Override
	public List<CabBookingDTO> getDetails(long mobileNo) {
		return bookingRepository.getCabDetailsByMobile(mobileNo);
		
	}

	@Override
	public void cancelBooking(Integer bookingId) throws CabBookingException {
		 CabBooking booking = bookingRepository.findById(bookingId).orElseThrow(() -> new CabBookingException("Cab booking not found"));
				
		bookingRepository.deleteById(booking.getBookingId());
		
	}

}

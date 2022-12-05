package com.infy.api.controller;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.infy.api.dto.CabBookingDTO;
import com.infy.api.exception.CabBookingException;
import com.infy.api.payloads.ApiResponse;
import com.infy.api.service.BookingService;

@RestController
@RequestMapping("/booking")
public class CabBookingAPI {

	@Autowired
	BookingService bookingService;

	@Autowired
	Environment environment;
	
	
	private static final Log LOGGER = LogFactory.getLog(CabBookingAPI.class);

	
	
	@RequestMapping(method = RequestMethod.POST, value = "/")
	public ResponseEntity<String> bookCab(@RequestBody CabBookingDTO cabBookingDTO) {
		try {
			Integer cabBookingId = bookingService.bookCab(cabBookingDTO);

			LOGGER.info("\n" + environment.getProperty("API.BOOKING_SUCCESSFUL") +"with ID"+ cabBookingId);

		} catch (Exception e) {

			LOGGER.info(
					"\n" + environment.getProperty(e.getMessage(), "Some exception occured.Please check log file."));

		}
		return new ResponseEntity<String>(environment.getProperty("API.BOOKING_SUCCESSFUL")+String.valueOf(cabBookingDTO.getBookingId()), HttpStatus.CREATED);

	}
	
	
	
	
	@RequestMapping(method = RequestMethod.GET ,value="/{mobileNo}")
	public ResponseEntity<List<CabBookingDTO>> getBookingDetails(@PathVariable("mobileNo") long mobileNo ) {
		
		return new ResponseEntity<List<CabBookingDTO>>(bookingService.getDetails(mobileNo),HttpStatus.OK) ;
		
	}
	
	
	
	
	@RequestMapping(method = RequestMethod.PUT , value="/{bookingId}")
	public ResponseEntity<ApiResponse> cancelBooking(@PathVariable("bookingId") Integer bookingId) throws CabBookingException{
	    bookingService.cancelBooking(bookingId);
	   LOGGER.info("\n"+environment.getProperty("API.BOOKING_CANCELLED")+bookingId);
	   return new ResponseEntity<ApiResponse>(new ApiResponse(environment.getProperty("API.BOOKING_CANCELLED"), String.valueOf(bookingId)), HttpStatus.OK);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

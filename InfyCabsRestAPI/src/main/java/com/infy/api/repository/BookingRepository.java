package com.infy.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.infy.api.dto.CabBookingDTO;
import com.infy.api.entities.CabBooking;

@Repository
public interface BookingRepository extends JpaRepository<CabBooking, Integer>{

	@Query("select cb from CabBooking cb where cb.usermobile=:mobileNo")
	List<CabBookingDTO> getCabDetailsByMobile(long mobileNo);

}

package com.infy.validator;

import java.time.LocalDate;

import com.infy.dto.BookDTO;
import com.infy.entity.Book;
import com.infy.exception.InfyBookException;

public class Validator {

	public static void validate(BookDTO bookDTO) throws InfyBookException {

		if(!validateYear(bookDTO.getPublishedYear()))
			throw new InfyBookException("Validator.INVALID_YEAR");
	}

	public static boolean validateYear(LocalDate year) {
		if(!(year.isBefore(year.now())) && (year.isBefore(year.now()))) {
			return true;
		}else
		
		return false;
	}

}

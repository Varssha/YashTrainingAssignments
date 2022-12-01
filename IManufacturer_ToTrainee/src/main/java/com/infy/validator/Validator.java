package com.infy.validator;

import org.springframework.stereotype.Component;

import com.infy.dto.EmployeeDTO;
import com.infy.exception.InfyEmployeeException;

@Component
public class Validator {
	
	public static void validate(EmployeeDTO employee) throws InfyEmployeeException	{
		if(!validateEmailId(employee.getEmailId()))
			throw new InfyEmployeeException("Validator.INVALID_EMAILID");
		
	}
	
	public static Boolean validateEmailId(String emailId)	{
		
		return emailId.matches("[\\w]+@[\\w]+\\.[\\w]+") ? true : false;
	}

}

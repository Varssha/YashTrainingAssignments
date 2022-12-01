package com.infy.repository;

import org.springframework.stereotype.Repository;
import com.infy.dto.EmployeeDTO;
import com.infy.exception.InfyEmployeeException;

@Repository
public interface EmployeeRepository {

	public Integer addEmployee(EmployeeDTO employee) throws InfyEmployeeException;
	
	public EmployeeDTO getEmployeeDetails(Integer employeeId) throws InfyEmployeeException;
	
	public void updateEmployee(Integer employeeId, String emailId) throws InfyEmployeeException;
	
	public void deleteEmployee(Integer employeeId) throws InfyEmployeeException;
}

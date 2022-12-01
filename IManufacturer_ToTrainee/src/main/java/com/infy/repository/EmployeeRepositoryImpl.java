package com.infy.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.infy.dto.EmployeeDTO;
import com.infy.exception.InfyEmployeeException;
import com.infy.service.EmployeeService;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {

	@Autowired
	EmployeeService employeeService;
	
	@Override
	public Integer addEmployee(EmployeeDTO employee) throws InfyEmployeeException {
		
	return employeeService.addEmployee(employee);
		
	}

	@Override
	public EmployeeDTO getEmployeeDetails(Integer employeeId) throws InfyEmployeeException {
		return employeeService.getEmployeeDetails(employeeId);
	}

	@Override
	public void updateEmployee(Integer employeeId, String emailId) throws InfyEmployeeException {
		employeeService.updateEmployee(employeeId, emailId);
	}

	@Override
	public void deleteEmployee(Integer employeeId) throws InfyEmployeeException {
		employeeService.deleteEmployee(employeeId);
	}
	
	
}
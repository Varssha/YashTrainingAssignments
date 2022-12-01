package com.infy.mapper;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

import org.springframework.jdbc.core.RowMapper;

import com.infy.dto.ManufacturingUnit;
import com.infy.entity.Employee;

public class EmployeeMapper implements RowMapper<Employee>{

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee e= new Employee();
		e.setEmployeeId(rs.getInt("EMPLOYEE_ID"));
		e.setDateOfBirth(rs.getDate("DATE_OF_BIRTH").toLocalDate());
		e.setEmailId(rs.getString("EMAIL_ID"));
		e.setManufacturingUnit(ManufacturingUnit.valueOf(rs.getString("MANUFACTURING_UNIT")));
		e.setName(rs.getString("EMPLOYEE_NAME"));
		return e;
	}

}

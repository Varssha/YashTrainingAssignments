package com.infy.service;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.stereotype.Service;

import com.infy.dto.EmployeeDTO;
import com.infy.entity.Employee;
import com.infy.exception.InfyEmployeeException;
import com.infy.mapper.EmployeeMapper;
import com.infy.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Lazy
	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	ModelMapper modelMapper;

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public Integer addEmployee(EmployeeDTO employee) throws InfyEmployeeException {

		String sql = "insert into employee(employee_id,date_of_birth,email_id,manufacturing_unit,employee_name) values(?,?,?,?,?)";
		 jdbcTemplate.update(sql, new PreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement ps) throws SQLException {

				ps.setInt(1, employee.getEmployeeId());
				ps.setDate(2, Date.valueOf(employee.getDateOfBirth()));
				ps.setString(3, employee.getEmailId());
				ps.setString(4, employee.getManufacturingUnit().toString());
				ps.setString(5, employee.getName());
			}

		});
		return employee.getEmployeeId();
	}

	@SuppressWarnings("deprecation")
	@Override
	public EmployeeDTO getEmployeeDetails(Integer employeeId) throws InfyEmployeeException {
		String sql="select * from employee where employee_id=?";
		Employee emp=null;
		try {
		emp= jdbcTemplate.queryForObject(sql, new Object[] {employeeId}, new EmployeeMapper());
		}catch(EmptyResultDataAccessException ex) {
			return null;
		}
		return this.modelMapper.map(emp, EmployeeDTO.class);
	}

	@Override
	public void updateEmployee(Integer employeeId, String emailId) throws InfyEmployeeException {
      String sql="UPDATE employee SET email_id=? WHERE employee_id=?";
		 jdbcTemplate.update(sql,emailId, employeeId);
	}

	@Override
	public void deleteEmployee(Integer employeeId) throws InfyEmployeeException {
      String sql="delete from employee where employee_id=?";
      jdbcTemplate.update(sql,employeeId);
	}
}

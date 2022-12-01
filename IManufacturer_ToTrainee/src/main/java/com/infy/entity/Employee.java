package com.infy.entity;

import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.infy.dto.ManufacturingUnit;

@Entity
@Table(name="EMPLOYEE")
public class Employee {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="EMPLOYEE_ID")
	private Integer employeeId;
	
	@Column(name="EMAIL_ID")
	private String emailId;
	
	@Column(name="EMPLOYEE_NAME")
	private String name;
	
	@Column(name="DATE_OF_BIRTH")
	private LocalDate dateOfBirth;
	
	@Enumerated(EnumType.STRING)
	@Column(name="MANUFACTURING_UNIT")
	private ManufacturingUnit manufacturingUnit;
	
	public Employee() {}
	
	public Employee(Integer employeeId, String emailId, String name, LocalDate dateOfBirth,
			ManufacturingUnit manufacturingUnit) {
		super();
		this.employeeId = employeeId;
		this.emailId = emailId;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.manufacturingUnit = manufacturingUnit;
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public ManufacturingUnit getManufacturingUnit() {
		return manufacturingUnit;
	}

	public void setManufacturingUnit(ManufacturingUnit manufacturingUnit) {
		this.manufacturingUnit = manufacturingUnit;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dateOfBirth, emailId, employeeId, manufacturingUnit, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(dateOfBirth, other.dateOfBirth) && Objects.equals(emailId, other.emailId)
				&& Objects.equals(employeeId, other.employeeId) && manufacturingUnit == other.manufacturingUnit
				&& Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", emailId=" + emailId + ", name=" + name + ", dateOfBirth="
				+ dateOfBirth + ", manufacturingUnit=" + manufacturingUnit + "]";
	}
	
	
	
}

package com.infy.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="classroom")
public class Classroom {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String classroomId;
	private String buildingName;
	private Integer capacity;
	private Integer availableCapacity;
	
	@OneToMany(mappedBy="trainee")  
	List<Trainee> trainees= new ArrayList<Trainee>();
	
	
	public Classroom(List<Trainee> trainees) {
		super();
		this.trainees = trainees;
	}
	public Classroom(String classroomId, String buildingName, Integer capacity, Integer availableCapacity) {
		super();
		this.classroomId = classroomId;
		this.buildingName = buildingName;
		this.capacity = capacity;
		this.availableCapacity = availableCapacity;
	}
	public String getClassroomId() {
		return classroomId;
	}
	public void setClassroomId(String classroomId) {
		this.classroomId = classroomId;
	}
	public String getBuildingName() {
		return buildingName;
	}
	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}
	public Integer getCapacity() {
		return capacity;
	}
	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}
	public Integer getAvailableCapacity() {
		return availableCapacity;
	}
	public void setAvailableCapacity(Integer availableCapacity) {
		this.availableCapacity = availableCapacity;
	}
	@Override
	public String toString() {
		return "Classroom [classroomId=" + classroomId + ", buildingName=" + buildingName + ", capacity=" + capacity
				+ ", availableCapacity=" + availableCapacity + "]";
	}

	
}

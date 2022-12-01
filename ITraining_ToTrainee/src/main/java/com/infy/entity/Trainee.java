package com.infy.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.infy.dto.ClassroomDTO;

@Entity
@Table(name="trainee")
public class Trainee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer traineeId;
	private String traineeName;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="TRAINEE_ID")
	private Classroom classroom;

	public Trainee() {}
	
	public Trainee(Integer traineeId, String traineeName) {
		super();
		this.traineeId = traineeId;
		this.traineeName = traineeName;
	}

	public Integer getTraineeId() {
		return traineeId;
	}

	public void setTraineeId(Integer traineeId) {
		this.traineeId = traineeId;
	}

	public String getTraineeName() {
		return traineeName;
	}

	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}

	
	public Classroom getClassroom() {
		return classroom;
	}

	public void setClassroom(Classroom classroom) {
		this.classroom = classroom;
	}

	@Override
	public String toString() {
		return "Trainee [traineeId=" + traineeId + ", traineeName=" + traineeName + ", classroom=" + classroom + "]";
	}
	
	
	
}
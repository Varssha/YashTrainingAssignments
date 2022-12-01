package com.example.demo.stream;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Student {
	
	private int rollno;
	private LocalDateTime date_of_addmission,dob;
	private int maths, physics, chemistry, english, hindi; // marks in subjects
	private String classname;

	
	public Student() {}
    
	public Student(int rollno, LocalDateTime date_of_addmission, LocalDateTime dob, int maths, int physics,
			int chemistry, int english, int hindi, String classname) {
		super();
		this.rollno = rollno;
		this.date_of_addmission = date_of_addmission;
		this.dob = dob;
		this.maths = maths;
		this.physics = physics;
		this.chemistry = chemistry;
		this.english = english;
		this.hindi = hindi;
		this.classname = classname;
	}


	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public LocalDateTime getDate_of_addmission() {
		return date_of_addmission;
	}

	public void setDate_of_addmission(LocalDateTime date_of_addmission) {
		this.date_of_addmission = date_of_addmission;
	}

	public LocalDateTime getDob() {
		return dob;
	}

	public void setDob(LocalDateTime dob) {
		this.dob = dob;
	}

	public int getMaths() {
		return maths;
	}

	public void setMaths(int maths) {
		this.maths = maths;
	}

	public int getPhysics() {
		return physics;
	}

	public void setPhysics(int physics) {
		this.physics = physics;
	}

	public int getChemistry() {
		return chemistry;
	}

	public void setChemistry(int chemistry) {
		this.chemistry = chemistry;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getHindi() {
		return hindi;
	}

	public void setHindi(int hindi) {
		this.hindi = hindi;
	}

	public String getClassname() {
		return classname;
	}

	public void setClassname(String classname) {
		this.classname = classname;
	}

	
	
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", date_of_addmission=" + date_of_addmission + ", dob=" + dob + ", maths="
				+ maths + ", physics=" + physics + ", chemistry=" + chemistry + ", english=" + english + ", hindi="
				+ hindi + ", classname=" + classname + "]";
	}

	public static void main(String[] args) {
		
		
		Student s1= new Student(1, LocalDateTime.of(2022,Month.JUNE, 19,20,20), LocalDateTime.of(2001,Month.JUNE, 20,10,20), 80,70,70,80,75, "10th");
		Student s2= new Student(2, LocalDateTime.of(2022,Month.JUNE, 19,21,20), LocalDateTime.of(2022,Month.JUNE, 19,20,20), 40,20,30,40,30, "10th");
		Student s3= new Student(3, LocalDateTime.of(2022,Month.JUNE, 19,22,20), LocalDateTime.of(2022,Month.JUNE, 19,10,20), 90,80,90,80,90,"10th");
		Student s4= new Student(4,LocalDateTime.of(2022,Month.JUNE, 19,21,20), LocalDateTime.of(2022,Month.JUNE, 19,10,10), 50,60,70,80,60, "10th");
		Student s5= new Student(5, LocalDateTime.of(2022,Month.JUNE, 19,14,20), LocalDateTime.of(2022,Month.JUNE, 19,10,20), 50,60,70,80,60, "10th");
		Student s6= new Student(6,LocalDateTime.of(2022,Month.JUNE, 19,17,20), LocalDateTime.of(2022,Month.JUNE, 19,20,20),  90,80,90,80,80, "10th");
		
		
		
		
		List<Student> list= new ArrayList<Student>(Arrays.asList(s1,s2,s3,s4,s5,s6));
		
		int avg1= (s1.getChemistry()+s1.getEnglish()+s1.getHindi()+s1.getMaths()+s1.getPhysics())/5;
		int avg2= (s2.getChemistry()+s2.getEnglish()+s2.getHindi()+s2.getMaths()+s2.getPhysics())/5;
		int avg3= (s3.getChemistry()+s3.getEnglish()+s3.getHindi()+s3.getMaths()+s3.getPhysics())/5;
		int avg4= (s4.getChemistry()+s4.getEnglish()+s4.getHindi()+s4.getMaths()+s4.getPhysics())/5;
		int avg5= (s5.getChemistry()+s5.getEnglish()+s5.getHindi()+s5.getMaths()+s5.getPhysics())/5;
		int avg6= (s6.getChemistry()+s6.getEnglish()+s6.getHindi()+s6.getMaths()+s6.getPhysics())/5;
		
		Map<Student, Integer> map=new HashMap<Student,Integer>();
		
		map.put(s1, avg1);
		map.put(s2, avg2);
		map.put(s3, avg3);
		map.put(s4, avg4);
		map.put(s5, avg5);
		map.put(s6, avg6);
		
		//WAP to print list of all students who’s total marks are less than 40%.

		List<Student> list2 = map.entrySet().stream().filter(s->s.getValue()<40).map(Map.Entry::getKey).collect(Collectors.toList());
		for (Student student : list2) {
			System.out.println("List of student who's total marks are less than 40%-\n"+student);
			
		}
		
		//3. WAP to print list of all those students who scored more than 75% in all subjects.
		List<Student> list3 = map.entrySet().stream().filter(s->s.getValue()>75).map(Map.Entry::getKey).collect(Collectors.toList());
		for (Student stu : list3) {
			System.out.println("List of students who scored more than 75%-\n"+stu);
			
		}
		
		int count=0;
		
		//5. Find how many students are promoted to another class
		List<Student> list4 = map.entrySet().stream().filter(s->s.getValue()>40).map(Map.Entry::getKey).collect(Collectors.toList());
		for (Student s : list4) {
			count++;
			
			
		}
		System.out.println(count+" number of students promoted to another class");
	}
	
	
}

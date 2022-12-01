package com.demo.exception_1;



public class StudentResult {
	
	private int maths;
	private int english;
	private int physics;
	private int chemistry;
	private int eco;
	
	
	
	public StudentResult(int maths, int english, int physics, int chemistry,int eco) {
		super();
		this.maths = maths;
		this.english = english;
		this.physics = physics;
		this.chemistry = chemistry;
		this.eco = eco;
	}
	@Override
	public String toString() {
		return "StudentResult [maths=" + maths + ", english=" + english + ", physics=" + physics + ", chemistry="
				+ chemistry + ", eco=" + eco + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

package com.programs;

public class Height {
	
	private int feet;
	private int inches;
	
	public Height(int feet, int inches) {
		super();
		this.feet = feet;
		this.inches = inches;
	}

	public int getFeet() {
		return feet;
	}

	public void setFeet(int feet) {
		this.feet = feet;
	}

	public int getInches() {
		return inches;
	}

	public void setInches(int inches) {
		this.inches = inches;
	}

	@Override
	public String toString() {
		return "Height [feet=" + feet + ", inches=" + inches + "]";
	}
	

	
}

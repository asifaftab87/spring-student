package org.la.student.asif.model;

public class Student {

	private int roll;
	private String name;
	private int standard;
	
	public Student(int roll, String name, int standard) {
		super();
		this.roll = roll;
		this.name = name;
		this.standard = standard;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStandard() {
		return standard;
	}
	public void setStandard(int standard) {
		this.standard = standard;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", standard=" + standard + "]";
	}
}

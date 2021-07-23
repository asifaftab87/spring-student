package org.la.student.barry.model;

public class Student {
 
	private int roll;
	private String name;
	private String standard;
	
	
	public Student(int roll, String name, String i) {
		super();
		this.roll = roll;
		this.name = name;
		this.standard = i;
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
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", standard=" + standard + "]";
	}
	
		
}

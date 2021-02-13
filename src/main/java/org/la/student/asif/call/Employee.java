package org.la.student.asif.call;

public class Employee {

	private int id;
	private String name;
	String designation;			//default access specifier
	
	public Employee() {}
	
	public Employee(int id, String name, String designation) {
		this.id = id;
		this.name = name;
		this.designation = designation;
	}
	
	public void print() {
		System.out.println("id: "+id);
		System.out.println("name: "+name);
		System.out.println("designation: "+designation);
	}
	
	public void set(int id, String name, String designation) {
		this.id = id;
		this.name = name;
		this.designation = designation;
	}
	
	void defaultMsg() {
		System.out.println("not accessible by different package, but same package allowed");
	}
}

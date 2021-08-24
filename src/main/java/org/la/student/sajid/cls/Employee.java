package org.la.student.sajid.cls;

public class Employee {
	private int id;
	private String name;
	String designation;     // Default access specifiers
	
	public Employee() {
		
	}
	
	public Employee(int i,String n,String d) {
		this.id=i;
		this.name=n;
		this.designation=d;
	}
	
	public void print() {
		System.out.println("id: "+id);
		System.out.println("name: "+name);
		System.out.println("designation: "+designation);
	}
	
	public void set(int i,String n,String d) {
		this.id=i;
		this.name=n;
		this.designation=d;
	}
	
	void defaultMsg() {
		System.out.println("not accessable by the different package,but same package are allowed");
	}

}

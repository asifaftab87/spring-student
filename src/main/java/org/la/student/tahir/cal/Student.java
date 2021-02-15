package org.la.student.tahir.cal;

public class Student {

	private int id;
	private String name;
	
	
	
	public void neew() {
		
		System.out.println("From call package");
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id= id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name= name;
	}
}

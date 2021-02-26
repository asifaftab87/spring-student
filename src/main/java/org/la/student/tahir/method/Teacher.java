package org.la.student.tahir.method;

public class Teacher {
	private String designation = "Teacher";
	private String collegename = "LIMKO";
	
	public String getDesignation() {
		return designation;
		
	}
	
	protected void setDesignation(String designation) {
		this.designation = designation;
	}
	
	public String getCollegename() {
		return collegename;
	}
	
	protected void setCollegename(String collegename) {
		this.collegename = collegename;
		
	}
	
	static protected  void Does() {
		System.out.println("Teaching");
	}
}

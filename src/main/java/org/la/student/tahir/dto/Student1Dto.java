package org.la.student.tahir.dto;

public class Student1Dto {

	private String name, dob, email;
	private int id, schoolId;
	
	public String getName() {
		
		return name;
	}

	public void setname(String name) {
		
		this.name = name;
	}
	
	public String getDob() {
		
		return dob;
	}
	
	public void setDob( String dob) {
		
		this.dob = dob;
	}
	
	public String getEmail() {
		
		return email;
	}
	
	public void setEmail(String email) {
		
		this.email = email;
	}
	
	public int getId() {
		
		return id;
	}
	
	public void setId( int id) {
		
		this.id = id;
	}
	
	public int getSchoolId() {
		
		return schoolId;
	}
	
	public void setSchoolId(int schoolId) {
		
		this.schoolId = schoolId;
	}
	
	public String toString() {
		
		return  "Name:" + name + " Dob: " + dob + " Email: " + email + " Id: " + id + " SchoolId: " + schoolId;
	}
	
	
}

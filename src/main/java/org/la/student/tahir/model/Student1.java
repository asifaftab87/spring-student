package org.la.student.tahir.model;

public class Student1 {
	

	/*create a model class Student having fields id, name, dob, email, schoolId
	create a dto class StudentDto having fields id, name, dob, email, schoolId
	copy from model to dto class manually as well as automatically using dozerbeanmapper class and print.*/
	
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
}

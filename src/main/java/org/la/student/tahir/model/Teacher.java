package org.la.student.tahir.model;

public class Teacher {
	
	/*create a model class Teacher having fields id, TeacherId, name, dob, email, schoolId, fatherName
	create a dto class TeacherDto having fields id, TeacherId, name, dob, email, schoolId, fatherName
	copy from model to dto class manually as well as automatically using dozerbeanmapper class and print.*/
	
	private String name, dob, email,fatherName;
	private int id, TeacherId;
	
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
	
	public String getFatherName() {
		
		return fatherName;
	}
	
	public void setFatherName( String fatherName) {
		
		this.fatherName = fatherName;
	}
	
	public int getId() {
		
		return id;
	}
	
	public void setId( int id) {
		
		this.id = id;
	}
	
	public int getTeacherId() {
		
		return TeacherId;
	}
	
	public void setTeacherId( int TeacherId) {
		
		this.TeacherId = TeacherId;
	}
	
	

}

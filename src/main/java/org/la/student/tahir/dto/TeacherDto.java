package org.la.student.tahir.dto;

public class TeacherDto {
	

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
	
	
	public String toString() {
		
		return  "Name:" + name + " Dob: " + dob + " Email: " + email + " Id: " + id + " TeacherId: " + TeacherId + " FatherName: " + fatherName;
				}

}

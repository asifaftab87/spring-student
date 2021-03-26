package org.la.student.tahir.dto;

public class UserDto {

	private String name, dob, email;
	private int id;
	
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
	

	public String toString() {
		
		return  "Name:" + name + " Dob: " + dob + " Email: " + email + " Id: " + id;
				}
}

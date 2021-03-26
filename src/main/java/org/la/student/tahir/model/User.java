package org.la.student.tahir.model;

public class User {
	/* create a model class User having fields id, name, dob, email
	create a dto class UserDto having fields id, name, dob, email
	copy from model to dto class manually as well as automatically using dozerbeanmapper class and print.*/

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
}

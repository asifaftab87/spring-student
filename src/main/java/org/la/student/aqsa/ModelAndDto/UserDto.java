package org.la.student.aqsa.ModelAndDto;

public class UserDto {

	private  int id;
	private String name, dob, email;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
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
	public void setId(int id) {
		this.id=id;
	}

public String toString() {
	return id+" "+" "+name+" "+dob+" "+email+" ";
	
}
}

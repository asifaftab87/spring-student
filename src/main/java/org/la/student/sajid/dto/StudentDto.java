package org.la.student.sajid.dto;

public class StudentDto {
	
	private String name, email, fatherName;
	private int id, roll,standar;

	public int getStandar() {
		return standar;
	}

	public void setStandar(int stndar) {
		this.standar = stndar;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}
	
	@Override
	public String toString() {
		return "name: "+name+", email: "+", roll: "+roll;
		
	}


}

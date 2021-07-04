package org.la.student.rasheed.clas;
/*
 * Create a class Users having member variables id, fullName, email, gender, dateOfBirth, countryCode, createdAt. 
 * create getters and setters for all member variables. 
 * Create object of Users class in other class inside main method and 
 * set all member values and print all member values using getters.
 */

public class Users {
	
	private int Id;
	private String fullName;
	private String gender;
	private String dateOfBirth;
	private int countryCode;
	private String createdAt;
	
	
	
	public int getId() {
		return Id;
	}
	public String getfullName () {
		return fullName;
	}
	public String getgender () {
		return gender;
	}
	public String getdateOfBirth () {
		return dateOfBirth;
	}
	public int getcountryCode () {
		return countryCode;
	}
	public String getcreatedAt () {
		return createdAt;
	}
	public void setId (int i) {
		Id = i;
	}
	public void setfullName (String f) {
		fullName = f;
	}
	public void setgender (String g) {
		gender = g;
	}
	public void setdateOfBirth (String b) {
		dateOfBirth = b;
	}
	public void setcountryCode (int c) {
		countryCode = c;
	}
	public void setcreatedAt(String r) {
		createdAt = r;
	}
	public void display() {
		System.out.println("Id : "+Id+" Full Name : "+fullName+" Gender : "+gender+"  Date Of Birth : "+dateOfBirth+" Country Code : "+countryCode+" Created At : "+createdAt);
	}

}

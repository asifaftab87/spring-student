package org.la.student.barry.clas.task;
import java.util.Date;
public class Users {
	/*
	 * Create a class Users having member variables id, fullName, email, gender, dateOfBirth,
	 *  countryCode, createdAt. create getters and setters for all member variables.
	 *   Create object of Users class in other class inside main method and set all member 
	 *   values and print all member values using getters.
	 */
  
  
	private int id;
	private String fullName;
	private String email;
	private String gender;
	private String dateOfBirth;
	private int countryCode;
	
	public int getId() {
		return id;
	}
	public void setId(int i) {
		id=i;
	}
	public int getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(int j) {
		countryCode=j;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String f) {
		fullName=f;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String e) {
		email=e;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String d) {
		dateOfBirth=d;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String g) {
		gender=g;
	}
}

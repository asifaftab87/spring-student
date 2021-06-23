package org.la.student.bakil.objects;
/*
 * Create a class Users having member variables id, fullName, email, gender, dateOfBirth, countryCode, createdAt. 
 * create getters and setters for all member variables. 
   Create object of Users class in other class inside main method and set all member values and print all member values using getters.
 */
public class Users {

	
	private int id;
	private String firstName;
	private String email;
	private String gender;
	private String dateOfBirth;
	private String countryCode;
	private String createdAt;
	
	
	// Id 
	public void setId(int i) {
		id=i;
	}
	public int getId() {
		return id;
	}
	
	//First name 
	public void setFirstName(String f) {
		firstName=f;
	}
	public String getFirstName() {
		return firstName;
	}
	
	//Email
	public void setEmail(String e) {
		email=e;
	}
	public String getEmail() {
		return email;
	}
	
	// Gender 
	public void setGender(String g) {
		gender = g;
	}
	public String getGender() {
		return gender;
	}
	
	// Date of birth
	public void setDateOfBirth(String d) {
		dateOfBirth=d;
	}
	public String getdateOfBirth() {
		return dateOfBirth;
	}
	
	// Country code
	public void setCountryCode(String c) {
		countryCode=c;
	}
	public String getCountryCode() {
		return countryCode;
	}
	
	// Created at 
	public void setCreatedAt(String t) {
	createdAt=t;
	}
	public String getCreatedAt() {
		return createdAt;
	}
	
	public void display() {
		System.out.println("Id :"+id+"First name :"+firstName+"Email :"+email+"Gender :"+gender+"Date of birth :"+dateOfBirth+
				"Country code :"+countryCode+"Created at :"+createdAt);
	}
}

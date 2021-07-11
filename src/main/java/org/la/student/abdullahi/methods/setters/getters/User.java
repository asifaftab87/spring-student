package org.la.student.abdullahi.methods.setters.getters;

public class User {

	private int Id;
	private String FullName;
	private String Email;
	private String Gender;
	private String DateOfBirth;
	private String CountryCode;
	private String CreatedAt;
	
	
	public void setId(int i) {
		Id=i;
	}
	public int getId() {
		return Id;
	}
	
	public void setGender(String g) {
		Gender= g;
	}
	public String getGender() {
		return Gender;
	}


	public void setDateOfBirth(String d) {
		DateOfBirth= d;
	}
	public String getDateOfBirth() {
		return DateOfBirth;
	}


	public void setCountryCode(String c) {
		CountryCode= c;
	}
	public String getCountryCode() {
		return CountryCode;
	}


	public void setCreatedAt(String x) {
		CreatedAt= x;
	}
	public String getCreatedAt() {
		return CreatedAt;
	}
	
	public void setFullName(String f) {
		FullName= f;
	}
	public String getFullName() {
		return FullName;
	}
	public void setEmail(String e) {
		Email= e;
	}
	public String getEmail() {
		return Email;
	}


    
    
}
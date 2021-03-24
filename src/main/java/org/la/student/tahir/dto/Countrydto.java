package org.la.student.tahir.dto;

public class Countrydto {

	private String  name,  email, phoneCode,independenceDate, republicDate;
	private int countryId;
	
	public String getName() {
		
		return name;
	}
	
	public void setName( String name) {
		
		this.name = name;
	}

	public String getEmail() {
		
		return email;
	}
	
	public void setEmail( String email) {
		
		this.email= email;
	}
	
	
	public String getPhoneCode() {
		
		return phoneCode;
	}
	
	public void setPhoneCode(String phoneCode) {
		
		this.phoneCode= phoneCode;
	}
	
	public int getCountryId() {
		
		return countryId;
	}
	
	public void setCountryId( int countryId) {
		
		this.countryId= countryId;
	}
	
	public String getIndependenceDate() {
		
		return independenceDate;
	}
	
	public void setIndependenceDate( String independenceDate) {
		
		this.independenceDate= independenceDate;
	}
	
	public String getRepublicDate() {
		
		return republicDate;
	}
	
	public void setRepublicDate( String republicDate) {
		
		this.republicDate = republicDate;
	}
	
	public String toString() {
		
		return "Name: "+ name + "  Email:" + email + "  PhoneCode:" + phoneCode + "  CountryId:" +  countryId + "  IndependenceDate:" + independenceDate+ "  RepublicDate:" + republicDate;
	}
}

package org.la.student.aqsa.ModelAndDto;

public class CountryDto {
	private int countryId , phoneCode;
	private String name, independenceDate, email, republicDate;
	public int getCountryId() {
		return countryId;
	}
	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}
	public int getPhoneCode() {
		return phoneCode;
	}
	public void setPhoneCode(int phoneCode) {
		this.phoneCode = phoneCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIndependenceDate() {
		return independenceDate;
	}
	public void setIndependenceDate(String independenceDate) {
		this.independenceDate = independenceDate;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRepublicDate() {
		return republicDate;
	}
	public void setRepublicDate(String republicDate) {
		this.republicDate = republicDate;
	}
	public String toString() {
		return countryId+"  " +name+"  "+independenceDate+"  "+email+"  "+phoneCode+"  "+republicDate;
	}
}

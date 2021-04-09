package org.la.student.tahir.dto;

public class SchoolDto {
	
	private String name, registrationDate, medium, address;
	private int schoolId;
	
	public String getName() {
		
		return name;
	}
	
	public void setName( String name)
	{
		this.name = name;
	}
	
	
	public String getRegistrationDate() {
		
		return registrationDate;
	}
	
	public void setRegistrationDate(String registrationDate) {
		
		this.registrationDate = registrationDate;
	}
	
	public String getMedium() {
		
		return medium;
	}
	
	public void setMedium(String medium) {
		
		this.medium = medium;
	}
	
	
	public String getAddress() {
		
		return address;
	}
	
	public void setAddress( String address) {
		
		this.address = address;
		
	}
	
	public int getSchoolId() {
		
		return schoolId;
	}
	
	public void setSchoolId(int schoolId) {
		
		this.schoolId = schoolId;
	}
	
	public String toString() {
		
		return name +"  " + registrationDate+ "  " + medium + "  "+ address+ "  " + schoolId;
	}

}

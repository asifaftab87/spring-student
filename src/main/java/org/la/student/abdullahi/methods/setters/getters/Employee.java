package org.la.student.abdullahi.methods.setters.getters;

public class Employee {


	private int Id;
	private String EmployeeName;
	private String EmployeeNumb;
	private String DateHired;
	private String CityId;

	
	
	public void setId(int a) {
		Id=a;
	}

	public int getId() {
		
		return Id;
	}
	
	public void setEmployeeName(String e) {
		EmployeeName=e;
	}
	public String getEmployeeName() {
		
		return EmployeeName;
	}
	
	public void setDateHired(String d) {
		DateHired=d;
	}
	public String getDateHired() {
		return DateHired;
	}
	
	public void setCityId(String c) {
		
		CityId=c;
	}
	public String getCityId() {
		return CityId;
	}
	
	public void setEmployeeNumb(String n) {
		
		EmployeeNumb=n;
	}
	public String getEmployeeNumb() {
		return EmployeeNumb;
	}
	
 
}
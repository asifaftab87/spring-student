package org.la.student.rasheed.clas;

/*
 * 
 * Create a class Employee having member variables id, employeeName, employeeNum, dateHired, cityId. 
 * create getters and setters for all member variables.
 *  Create object of Employee class in other class inside main method and 
 *  set all member values and print all member values using getters.
 */

public class Employe {
	
	private String employeeName;
	private String employeeNum;
	private String dateHired;
	private String cityId;
	
	
	
	public String getemployeeName() {
		return employeeName;
	}
	public String getemployeeNum() {
		return employeeNum;
	}
	public String getdateHired() {
		return dateHired;
	}
	public String getcityId() {
		return cityId;
	}
	
	
	
	public void setemployeeName(String e) {
		employeeName = e;
	}
	public void setemployeeNum(String n) {
		employeeNum = n;
	}
	public void setdateHired(String d) {
		dateHired = d;
	}
	public void setcityId(String c) {
		cityId = c;
		
	}
	public void display() {
		System.out.println("Employee Name : "+employeeName+" Employee Number : "+employeeNum+" Date Hired : "+dateHired+" City Id : "+cityId);
	}

}

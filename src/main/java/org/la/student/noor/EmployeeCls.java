package org.la.student.noor;
/*Create a class Employee having member variables id, employeeName, employeeNum, dateHired, cityId. create getters and setters for all member variables. Create object of Employee class in other class inside main method and set all member values and print all member values using getters.*/

public class EmployeeCls {
	private int Id;
	private String employeeName;
	private int employeeNum;
	private  String dateHired;
	private int cityId;
	
	public void setId(int i) {
		Id=i;
	}
	
	public int getId() {
		return Id;
	}
	
	
	public void setemployeeName(String n) {
		employeeName=n;
	}
	
	public String getemployeeName() {
		return employeeName;
	}
	
	
	public void setemployeeNum(int e) {
		employeeNum=e;
	}
	
	public int getemployeeNum() {
		return employeeNum;
	}
	
	public void setdateHired(String d) {
		dateHired=d;
	}
	
	public String getdateHired() {
		return dateHired;
	}
	
	public void setcityId( int c) {
		cityId=c;
	}
	
	public int getcityId() {
		return cityId;
	}
	
	public void display() {
		System.out.println("Id:" +Id);
		System.out.println("employeeName:" +employeeName);
		System.out.println("employeeNum:" +employeeNum);
		System.out.println("dateHired:" +dateHired);
		System.out.println("cityId:" +cityId);
	}
	
	

}

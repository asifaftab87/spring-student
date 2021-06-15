package org.la.student.barry.clas.task;

public class Employee {
	
	/*
	 * Create a class Employee having member variables id, employeeName, 
	 * employeeNum, dateHired, cityId. create getters and setters for all member variables. 
	 * Create object of Employee class in other class inside main method and 
	 * set all member values and print all member values using getters.
	 */

	private int id;
	private String employeeName;
	private int employeeNum;
	private String dateHired;
	private int cityId;
	
	public int getId() {
		return id;
	}
	public void setId(int i) {
		id=i;
	}

	public int getCityId() {
		return cityId;
	}
	public void setCityId(int j) {
		cityId=j;
	}

	public int getEmployeeNum() {
		return employeeNum;
	}
	public void setEmployeeNum(int k) {
		employeeNum=k;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String e) {
		employeeName=e; 
	}
	public String getDateHired() {
		return dateHired;
	}
	public void setDateHired(String d) {
		dateHired=d; 
	}
    public void display() {
    	System.out.println("Id:"+id+"CityId: "+cityId+ "EmployeeName: "+employeeName+ 
    			"EmployeeNum: " +employeeNum+ "DateHired");
    }
}

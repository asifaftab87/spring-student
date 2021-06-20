package org.la.student.nizaam.clas;

/*
 * Create a class Employee having member variables id, employeeName, employeeNum, dateHired, cityId. create getters and setters for all member variables. 
		Create object of Employee class in other class inside main method and set all member values and print all member values using getters.
 */
public class Employee {

	private int id,employeeNum,cityId;
	private String employeeName,datehired;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getEmployeeNum() {
		return employeeNum;
	}
	public void setEmployeeNum(int employeeNum) {
		this.employeeNum = employeeNum;
	}
	public int getCityId() {
		return cityId;
	}
	public void setCityId(int cityId) {
		this.cityId = cityId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDatehired() {
		return datehired;
	}
	public void setDatehired(String datehired) {
		this.datehired = datehired;
	}
}

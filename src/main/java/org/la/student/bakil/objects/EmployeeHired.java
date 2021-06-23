package org.la.student.bakil.objects;
/*
 * Create a class Employee having member variables id, employeeName, employeeNum, dateHired, cityId. create getters and setters for all member variables. 
   Create object of Employee class in other class inside main method and set all member values and print all member values using getters.
 */
public class EmployeeHired {

	
	private int id;
	private String employeeName ;
	private String employeeNum;
	private String dateHired;
	
	
	public void setId(int i) {
		id =i;
	}
	public int getId() {
		return id;
	}
	
	public void setEmployeeName(String n) {
		employeeName=n;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	
	
	public void setEmployeeNum(String m) {
		employeeNum=m;
	}
	public String getEmployeeNum() {
		return employeeNum;
	}
	
	public void setDateHired(String d) {
		dateHired= d;
	}
	public String getDateHired() {
		 return dateHired;
	}


	public void display () {
		System.out.println("Id :"+id+"Employee name :"+employeeName+"Employee number :"+employeeNum+"Date hired :"+dateHired);
	}
}

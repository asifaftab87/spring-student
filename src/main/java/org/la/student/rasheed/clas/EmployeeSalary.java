package org.la.student.rasheed.clas;


/*
 * 
 * Create a class SalariedEmployee having member variables id, annualSalary, employeeId. 
 * create getters and setters for all member variables. 
 * Create object of SalariedEmployee class in other class inside main method and 
 * set all member values and print all member values using getters
 */

public class EmployeeSalary {
	
	private String  annualSalary;
	private String employeeId;
	
	
	public String getannualSalary() {
		return annualSalary;
		
	}
	
	public String getemployeeId() {
		return employeeId;
	}
	
	public void setannualSalary (String a) {
		annualSalary = a;
	}
	
	public void setemployeeId(String e) {
		employeeId = e;
	}
	public void display() {
		System.out.println("Annual Salary : "+annualSalary+" Employee Id : "+employeeId);
	}

	
		
	}
	



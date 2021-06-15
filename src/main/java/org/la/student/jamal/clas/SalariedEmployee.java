package org.la.student.jamal.clas;
/*
 * 7.	Create a class SalariedEmployee having member variables id,
 *  annualSalary, employeeId. create getters and setters for all member variables.
 *   Create object of SalariedEmployee class in other class inside main method and 
 *   set all member values and print all member values using getters.
 */

public class SalariedEmployee {
	private int annualSalary ;
	private int employeeId;
	
	
	
	public int getAnnualSalary() {
		return annualSalary;
	}
	
	
	
	public int getEmployeeId() {
		return employeeId;
	}
	
	
	
	public void setAnnualSalary(int as) {
		annualSalary =as;
		
	}
	
	
	
	public void setemployeeId(int eid) {
		employeeId=eid;
	}
	
	public void display() {
		System.out.println("annualSalary: "+annualSalary+"employeeId: "+employeeId);
	}
	
	
	

}

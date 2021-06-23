package org.la.student.bakil.objects;
/*
 * Create a class SalariedEmployee having member variables id, annualSalary, employeeId. create getters and setters for all member variables. 
   Create object of SalariedEmployee class in other class inside main method and set all member values and print all member values using getters.
 */
public class SalariedEmployee {

	
	private int id;
	private String annualSalary;
	private int employeeId;
	
	
	public void setid(int i) {
		id =i;
	}
	public int getid() {
		return id;
	}
	
	//Annual salary
	public void setAnnualSalary(String s) {
		annualSalary=s;
	}
	public String getAnnualSalary() {
		return annualSalary;
	}
	
	// Employee id 
	public void setemployeeId(int e) {
		employeeId=e;
	}
	public int getemployeeId() {
		return employeeId;
	}
	
	public void display() {
		System.out.println("Id "+id+"Annual salary "+annualSalary+"Employee id "+employeeId);
	}
}

package org.la.student.noor;
/*Create a class SalariedEmployee having member variables id, annualSalary, employeeId. create getters and setters for all member variables. Create object of SalariedEmployee class in other class inside main method and set all member values and print all member values using getters.*/
public class SalariedEmployee {

	private int eId;
	private int annualSalary;
	private int employeeId;
	
	public void seteId(int i) {
		eId=i;
	}
	
	public int geteId() {
		return eId;
	}
	
	public void setannualSalary(int s) {
	    annualSalary=s;
	}
	
	public int getannualSalary() {
		return annualSalary;
	}
	
	public void setemployeeId(int e) {
		employeeId=e;
	}
	
	public int getemployeeId() {
		return employeeId;
	}
	
	public void display() {
		System.out.println("eId:" +eId);
		System.out.println("annualsalary:" +annualSalary);
		System.out.println("employeeId:" +employeeId);
	}
	
}

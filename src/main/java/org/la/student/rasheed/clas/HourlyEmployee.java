package org.la.student.rasheed.clas;

public class HourlyEmployee {
	
	private int Id;
	private String annualSalary;
	private int employeeId;
	
	
	
	public int getId () {
		return Id;
	}
	public String getannualSalary() {
		return annualSalary;
	}
	public int employeeId() {
		return employeeId;
	}
	public void setId(int i) {
		Id = i;
	}
	public void setannualSalary(String a) {
		annualSalary = a;
	}
	public void setemployeeId(int e) {
		employeeId = e;
	}
	public void display() {
		System.out.println("Id : "+Id+" Annual Salary : "+annualSalary+" Employee Id : "+employeeId);
	}

}

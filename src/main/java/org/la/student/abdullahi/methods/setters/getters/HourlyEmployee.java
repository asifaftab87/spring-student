package org.la.student.abdullahi.methods.setters.getters;

public class HourlyEmployee {


	private int Id;
	private String AnnualSalary;
	private String EmployeeId;
	
	
	
	public void setId(int a) {
		Id=a;
	}

	public int getId() {
		
		return Id;
	}
	
	public void setAnnualSalary(String s) {
		AnnualSalary=s;
	}
	public String getAnnualSalary() {
		
		return AnnualSalary;
	}
	
	
	
	public void setEmployeeId(String e) {
		
		EmployeeId=e;
	}
	public String getEmployeeId() {
		return EmployeeId;
	}
	
 
}
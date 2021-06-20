package org.la.student.nizaam.clas;

/*Create a class SalariedEmployee having member variables id, annualSalary, employeeId. create getters and setters for all member variables. 
		Create object of SalariedEmployee class in other class inside main method and set all member values and print all member values using getters.
		*/
public class SalariedEmployee {

	private int id;
	private double annualSalary;
	private String employeeId;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getAnnualSalary() {
		return annualSalary;
	}
	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
}

package org.la.student.bakil.objects;
/*
 * Create a class HourlyEmployee having member variables id, annualSalary, employeeId . create getters and setters for all member variables. 
   Create object of HourlyEmployee class in other class inside main method and set all member values and print all member values using getters.
 */
public class HourlyEmployee {

	
	private int idN;
	private String salaryAn;
	private int employeeId;
	
	public void steIdNum(int i) {
		idN=i;
	}
	
	public int getIdNum() {
		return idN;
	}
	
	public void setSalaryAn(String s) {
		salaryAn=s;
	}
	public String getAnnualSalaries() {
		return salaryAn;
	}
	
	public void setEmlpoyeeId(int e) {
		employeeId=e;
	}

	public int getEmployeeId() {
		return employeeId;
	}	
	
	public void display() {
		System.out.println("Id :"+idN+"Annual salary :"+salaryAn+"Employee id :"+employeeId);
	}
}


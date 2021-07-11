package org.la.student.abdullahi.methods.setters.getters;

public class HourlyEmployeeMain {


 
	public static void main(String[]args) {
		
		HourlyEmployee h = new HourlyEmployee();
		h.setId(1);
		h.setAnnualSalary("$150,000");
		h.setEmployeeId("001");
		
		int Id = h.getId();
		String AnnualSalary = h.getAnnualSalary();
		String EmployeeId = h.getEmployeeId();
		
		System.out.println("ID = " +Id);
		System.out.println("Annual Salary = " +AnnualSalary);
		System.out.println("Employee Id = "+ EmployeeId);
		
		
		
		
	}
}
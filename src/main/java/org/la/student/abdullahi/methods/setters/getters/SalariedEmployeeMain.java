package org.la.student.abdullahi.methods.setters.getters;

public class SalariedEmployeeMain {


 
	public static void main(String[]args) {
		
		SalariedEmployee s = new SalariedEmployee();
		s.setId(1);
		s.setAnnualSalary("$100,000");
		s.setEmployeeId("001");
		
		int Id = s.getId();
		String AnnualSalary = s.getAnnualSalary();
		String EmployeeId = s.getEmployeeId();
		
		System.out.println("ID = " +Id);
		System.out.println("Annual Salary = " +AnnualSalary);
		System.out.println("Employee Id = "+ EmployeeId);
		
		
		
		
	}
}
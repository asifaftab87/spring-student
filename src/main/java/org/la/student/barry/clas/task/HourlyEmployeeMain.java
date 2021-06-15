package org.la.student.barry.clas.task;

public class HourlyEmployeeMain {

	public static void main(String[] args) {
		HourlyEmployee hourlyEmployee= new HourlyEmployee();
		hourlyEmployee.setId(12);
		hourlyEmployee.setEmployeeId(045);
		hourlyEmployee.setAnnualSalary(55);
		
		int id = hourlyEmployee.getId();
		int employeeId= hourlyEmployee.getEmployeeId();
		int annualSalary=hourlyEmployee.getAnnualSalary();
		
		System.out.println("Id: "+ id);
		System.out.println("EmployeeId: "+employeeId);
		System.out.println("AnnualSalary: "+annualSalary);
		
		

	}

	

	

}

package org.la.student.barry.clas.task;

public class SalariedEmployeeMain {

	public static void main(String[] args) {
		SalariedEmployee salariedEmployee= new SalariedEmployee();
		salariedEmployee.setId(777);
		salariedEmployee.setEmployeeId(555);
		salariedEmployee.setAnnualSalary(10000);
		
		int id= salariedEmployee.getId();
		int employeeId= salariedEmployee.getEmployeeId();
		int annualSalary= salariedEmployee.getAnnualSalary();
		
		System.out.println("Id: "+id);
		System.out.println("EmployeeId: "+employeeId);
		System.out.println("AnnualSalary: "+annualSalary);
		

	}

}

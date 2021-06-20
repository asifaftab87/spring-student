package org.la.student.kayes.methods;

public class SalariedMain {

	public static void main(String[] args) {
		SalariedEmployee sal=new SalariedEmployee();
		sal.setId(10);
		sal.setSalary(450000);
		sal.setEmployee(56);
		
		int id=sal.getId();
		int empId=sal.getEmployee();
		int salary=sal.getSalary();
		
		System.out.println("id  =  "+id);
		System.out.println("employee id  = "+empId);
		System.out.println("salary  = "+salary);

	}

}

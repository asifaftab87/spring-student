package org.la.student.kayes.methods;

public class HourlyMain {

	public static void main(String[] args) {
		HourlyEmployee sal=new HourlyEmployee();
		sal.setId(12);
		sal.setSalary(550000);
		sal.setEmployee(5);
		
		int id=sal.getId();
		int empId=sal.getEmployee();
		int salary=sal.getSalary();
		
		System.out.println("id  =  "+id);
		System.out.println("employee id  = "+empId);
		System.out.println("salary  = "+salary);

	}

}

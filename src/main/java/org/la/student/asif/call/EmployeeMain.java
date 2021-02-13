package org.la.student.asif.call;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee employee = new Employee();
		
		employee.set(1, "jawed", "developer");
		employee.designation = "junior";
		employee.defaultMsg();		//default method
		
		employee.print();
	}
	
}

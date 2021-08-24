package org.la.student.sajid.call;

import org.la.student.sajid.cls.Employee;

public class EmployeeDiffPackage {
	public static void main(String[] args) {
		
		Employee employee=new Employee();
		employee.set(21, "prince","coder");
//		employee.defaultMsg();// Default method
		employee.print();
		
		}

}

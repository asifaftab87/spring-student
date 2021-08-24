package org.la.student.sajid.cls;

public class EmployeeMain {
	public static void main(String[] args) {
		Employee employee=new Employee();
		employee.set(21, "prince","coder");
		employee.defaultMsg();  // Default method
		employee.print();
	}

}

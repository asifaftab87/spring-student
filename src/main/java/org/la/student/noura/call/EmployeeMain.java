package org.la.student.noura.call;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee employee= new Employee();
		
		employee.set(1, "noura", "make up artist");
		employee.defaultMsg();    //default method
		employee.print();
	}

}

package org.la.student.asif.clas;

import org.la.student.asif.call.Employee;

public class ArrCls {

	public static void main(String[] args) {
		
		Employee[] employeeArr = new Employee[3];
		
		Employee e1 = new Employee(1, "ali", "ceo");
		Employee e2 = new Employee(2, "alina", "developer");
		Employee e3 = new Employee(3, "alam", "labour");
		
		employeeArr[0] = e1;
		employeeArr[1] = e2;
		employeeArr[2] = e3;
		
		/*
		for(int i=0 ; i<employeeArr.length ; i++) {
			Employee e = employeeArr[i];
			e.print();
		}
		*/
		
		for(Employee e : employeeArr) {
			e.print();
		}
	}
	
}

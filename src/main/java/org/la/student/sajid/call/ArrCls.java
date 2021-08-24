package org.la.student.sajid.call;

import org.la.student.sajid.cls.Employee;

public class ArrCls {
	public static void main(String[] args) {
//		array complex variable
		Employee [] employeeArr=new Employee[3];
		
		Employee e1=new Employee(1,"jam","HR");
		Employee e2=new Employee(2,"jonh","Ceo");
		Employee e3=new Employee(3,"jamshed","Coder");
		
		employeeArr[0]=e1;
		employeeArr[1]=e2;
		employeeArr[2]=e3;
		
		for(int i=0;i<employeeArr.length;i++) {
			Employee e= employeeArr[i];
			e.print();
		}
		for(Employee s: employeeArr) {      //for each loop
			s.print();
		}
	}

}

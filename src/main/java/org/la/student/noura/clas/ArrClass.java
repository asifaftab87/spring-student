package org.la.student.noura.clas;

import org.la.student.noura.call.Employee;

public class ArrClass {

	public static void main(String[] args) {

		Employee [] employeeArr= new Employee [3];
		
		
		Employee e1= new Employee(1,"khalid","eng");
		Employee e2= new Employee(2,"mohammed","ceo");
		Employee e3= new Employee(3,"naser","prog");

		
		employeeArr[0]=e1;
		employeeArr[1]=e2;
		employeeArr[2]=e3;

		for(int i=0;i<employeeArr.length;i++) {
		//System.out.println(employeeArr[i]);//will print the address
		//to print the value we have to create object like this>>>
		
		Employee e= employeeArr[i];    //25 to 
		e.print();                     //26>>>this code to print the value 
		
		
		employeeArr[i].print();  // another method to print the value
		
		
		}
		
		for(Employee e : employeeArr) {// for each loop   >>>as a third method to print value
			e.print();
		}
	}

}

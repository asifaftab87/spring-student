package org.la.student.jamal.clas;

public class SalariedEmployeeMain {

	public static void main(String[] args) {

 
		SalariedEmployee salariedEmployee=new SalariedEmployee();
		
		salariedEmployee.setemployeeId(110022);
		salariedEmployee.setAnnualSalary(21500);
		
		salariedEmployee.display();
		System.out.println();
		
		
		
		int as =salariedEmployee.getAnnualSalary();
		int eid=salariedEmployee.getEmployeeId();
		
		System.out.println("EmployeeId: "+eid+" AnnualSalary: "+as);
		
		
		
		
		
		

	}

}

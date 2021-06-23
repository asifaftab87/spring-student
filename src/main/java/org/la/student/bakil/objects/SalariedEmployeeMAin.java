package org.la.student.bakil.objects;

public class SalariedEmployeeMAin {

	public static void main(String[] args) {


		SalariedEmployee  salaried= new  SalariedEmployee();

		salaried.setid(21852);
		salaried.setAnnualSalary("4000 Dolars");
		salaried.setemployeeId(298733);

		int id =salaried.getid();
		String annualSalary= salaried.getAnnualSalary();
		int employeeId= salaried.getemployeeId();
		
		System.out.println("Id :"+id);
		System.out.println("Annual salary :"+annualSalary);
		System.out.println("Employee Id :"+employeeId);
	}

}

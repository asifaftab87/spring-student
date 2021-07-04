package org.la.student.rasheed.clas;

/*
 * Create a class HourlyEmployee having member variables id, annualSalary, employeeId .
 *  create getters and setters for all member variables. 
 * Create object of HourlyEmployee class in other class inside main method and
 *  set all member values and print all member values using getters.
 */

public class HourlyEmployeeMain {

	public static void main(String[] args) {
		
		
		HourlyEmployee hourlyemployee = new HourlyEmployee();
		hourlyemployee.setId(1223);
		hourlyemployee.setannualSalary("$200, 000");
		hourlyemployee.setemployeeId(4433);
		
		
		int Id = hourlyemployee.getId();
		String annualSalary = hourlyemployee.getannualSalary();
		int employeeId = hourlyemployee.employeeId();
		
		
		System.out.println("ID : "+Id);
		System.out.println("Annual Salary : "+annualSalary);
		System.out.println("Employee Id: "+employeeId);
	}

}

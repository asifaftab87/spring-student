package org.la.student.rasheed.clas;

public class EmployeeSalaryMain {

	public static void main(String[] args) {
		
		
		EmployeeSalary employeesalary = new EmployeeSalary();
		employeesalary.setannualSalary("$ 2000,000");
		employeesalary.setemployeeId("1929");
		
		
		
		String annualSalary = employeesalary.getannualSalary();
		String employeeId =employeesalary.getemployeeId();
		
		
		
		System.out.println("Annual Salary : "+annualSalary);
		System.out.println("Employee Id  : "+employeeId);

	}

}

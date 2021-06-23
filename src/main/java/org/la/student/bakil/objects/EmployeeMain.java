package org.la.student.bakil.objects;

public class EmployeeMain {

	public static void main(String[] args) {
	
		
		Employee employee = new Employee();
		
		employee.setid(3211);
		employee.setemployeeNum(99211);
		employee.setcityId(3556);

		
		int id = employee.getid();
		int employeeNum= employee.getemployeeNum();
		int cityId = employee.getcityId();
		
		System.out.println("Id :"+id);
		System.out.println("Employee number :"+employeeNum);
		System.out.println("City Id :"+cityId);
	}

}

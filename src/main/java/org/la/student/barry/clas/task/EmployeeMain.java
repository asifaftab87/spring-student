package org.la.student.barry.clas.task;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee employee= new Employee();
		employee.setId(6666);
		employee.setEmployeeName("Abdoul");
		employee.setEmployeeNum(454);
		employee.setCityId(45);
		employee.setDateHired("january 2020");
		
		
		int id= employee.getId();
		String employeeName= employee.getEmployeeName();
		int employeeNum= employee.getEmployeeNum();
		int cityId=employee.getCityId();
		String dateHired=employee.getDateHired();
		System.out.println("Id: "+id);
		System.out.println("EmployeeName: "+employeeName);
		System.out.println("EmployeeNum: "+ employeeNum);
		System.out.println("CityId: "+cityId);
		System.out.println("DateHired: "+dateHired);
		
		

	}

}

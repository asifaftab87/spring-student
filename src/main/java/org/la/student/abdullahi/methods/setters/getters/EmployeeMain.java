package org.la.student.abdullahi.methods.setters.getters;

public class EmployeeMain {

	public static void main(String[]args) {
	
		Employee e= new Employee();
		e.setId(1);
		e.setEmployeeName("Saeed");
		e.setEmployeeNumb("0012324");
		e.setDateHired("2nd,Feb,2021");
		e.setCityId("001");
		
		int Id= e.getId();
		String EmployeeName= e.getEmployeeName();
		String EmployeeNumb = e.getEmployeeNumb();
		String DateHired = e.getDateHired();
		String CityId = e.getCityId();
		
		System.out.println("ID = "+Id);
		System.out.println("Employee Name =" +EmployeeName);
		System.out.println("Employee Number = "+ EmployeeNumb);
		System.out.println("Date Hired = " +DateHired);
		System.out.println("CityId = "+ CityId);
		
		
		
		
	}
}
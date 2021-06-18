package org.la.student.jamal.clas;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee employee=new Employee();
		
		employee.setId(12123);
		employee.setEmployeeName("Jamal");
		employee.setEmployeeNum(13);
		employee.setDateHired("10-Jun-2020");
		employee.setCityId(90);
		
		
		int id=employee.getId();
		String ena=employee.getEmployeeName();
		int en=employee.getEmployeeNum();
		String dh=employee.getDateHired();
	    int cid=employee.getCityId();
	    
	    System.out.println("Id: "+id+" employeeName: "+ena+" employeeNun: "+en+" dateHired: "+dh+" cityId: "+cid);

	}

}

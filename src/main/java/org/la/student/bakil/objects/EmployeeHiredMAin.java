package org.la.student.bakil.objects;

public class EmployeeHiredMAin {

	public static void main(String[] args) {
		
	EmployeeHired hired =new EmployeeHired();
	
	hired.setId(2231);
	hired.setEmployeeName("Bakil");
	hired.setEmployeeNum("199872");
	hired.setDateHired("01/03/2020");
	
	int id = hired.getId();
	String employeeName=hired.getEmployeeName();
	String employeeNum =hired.getEmployeeNum();
	String dateHired = hired.getDateHired();
	
	System.out.println("Id :"+id+'\n'+"Employee name :"+employeeName+'\n'+"Employee number :"+employeeNum+'\n'+"Date hired :"+dateHired);
	}
}

package org.la.student.rasheed.clas;



public class EmployeMain {

	public static void main(String[] args) {
		
		
		Employe employe = new Employe();
		employe.setemployeeName("Abdulraheed Ibrahim");
		employe.setemployeeNum("09922332211");
		employe.setdateHired("01/10/2018");
		employe.setcityId("California");
		
		
		String employeeName = employe.getemployeeName();
		String employeeNum = employe.getemployeeNum();
		String dateHired = employe.getdateHired();
		String cityId = employe.getcityId();
		
		
		
		
		System.out.println("Employee Name : "+employeeName);
		System.out.println("Employee Number : "+employeeNum);
		System.out.println("Date Hired : "+dateHired);
		System.out.println("City Id : "+cityId);
	}

}

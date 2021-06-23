package org.la.student.kayes.methods;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.setId(7);
		emp.setName("KAYES");
		emp.setempNum(76);
		emp.setdate("11/10/2020");
		emp.setcity(700015);
		
		int id=emp.getId();
		String name=emp.getName();
		int empNum=emp.getempNum();
		String date=emp.getdate();
		int city=emp.getcity();
		
		System.out.println("id  =  "+id);
		System.out.println("name  =  "+name);
		System.out.println("employee number  =  "+empNum);
		System.out.println("date  =  "+date);
		System.out.println("city =  "+city);
	}

}

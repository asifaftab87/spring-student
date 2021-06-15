package org.la.student.noor;

public class EmployeeClsMain {

	public static void main(String[] args) {
		EmployeeCls emp=new EmployeeCls();
		emp.setId(1);
		emp.setemployeeName("Nazim");
		emp.setemployeeNum(10);
		emp.setdateHired("11th Jan");
		emp.setcityId(411048);
		
		//emp.display();
		
		int Id=emp.getId();
		String employeeName=emp.getemployeeName();
		int employeeNum=emp.getemployeeNum();
        String dateHired=emp.getdateHired();
        int cityId=emp.getcityId();
        
        System.out.println("Id:" +emp.getId());
		System.out.println("employeeName:" +emp.getemployeeName());
		System.out.println("employeeNum:" +emp.getemployeeNum());
		System.out.println("dateHired:" +emp.getdateHired());
		System.out.println("cityId:" +emp.getcityId());
		

	}

}

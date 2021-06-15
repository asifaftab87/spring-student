package org.la.student.noor;

public class SalariedEmployeeMain {

	public static void main(String[] args) {
		SalariedEmployee salemp=new SalariedEmployee();
		salemp.seteId(10);
		salemp.setannualSalary(1500000);
		salemp.setemployeeId(10);
		
		//empsal.display();
		
		int eId=salemp.geteId();
	    int setannualSalary=salemp.getannualSalary();
		int setemployeeId=salemp.getemployeeId();
		
		System.out.println("eId:" +salemp.geteId());
		System.out.println("annualsalary:" +salemp.getannualSalary());
		System.out.println("employeeId:" +salemp.getemployeeId());

	}

}

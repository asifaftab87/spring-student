package org.la.student.bakil.overloading;

public class EmployeeMain {

	public static void main(String[] args) {

		Employee employee = new Employee();
		employee.setId(3232);
		employee.setEmployeeName("Bakil");
		employee.setEmlpoyeePosiotion("Engineer");
	
	
		Company company = new Company ();
		company.setId(23232);
		company.setName("DHL");
		company.setEmployee(employee);
		display(company);
	
	}
	
	public static void display (Company company) {
		String emlpoyeePosiotion=company.getEmployee().getEmlpoyeePosiotion();
		System.out.println("Emlpoyee posiotion :"+emlpoyeePosiotion);
	}
	
	
	

}

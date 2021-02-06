package org.la.student.sajid.cls;

public class CompanyMain {
	public static void main(String[] args) {
		Company company=new Company();
		company.setValue("Dell", 5, 18549.23);
		company.display();
		System.out.println("View Getter though "+company.getValue());
	}

}

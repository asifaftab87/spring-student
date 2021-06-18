package org.la.student.jamal.clas;

public class CaompanyMain {

	public static void main(String[] args) {
		
		Company company = new Company();
		company.set("Jamal ", 101," Manger  "); 
		company.display();
		company.set("Ahmed ", 102," IT Manger  "); 
		company.display();
		
		company.set("Mohammed ", 103, "Employee");
		company.display();
		
		int id=company.getCompanyId();
		System.out.println("CompanyId: "+id );
				
		String n=company.getName();
	    System.out.println(n);
	    
	    String d=company.getDescription();
	    System.out.println(d);
		
		

	}

}

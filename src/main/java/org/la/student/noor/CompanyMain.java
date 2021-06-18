package org.la.student.noor;

public class CompanyMain {

	public static void main(String[] args) {
	Company comp=new Company();
	comp.setcompanyId(1);
	comp.setName("Infosys");
	comp.setDescription("Information Systems");
	
	//comp.display();
	
	int companyId=comp.getCompanyId();
	String name=comp.getName();
	String description=comp.getDescription();

	
	System.out.println("companyId:" +comp.getCompanyId());
	System.out.println("name:" +comp.getName());
	System.out.println("description:" +comp.getDescription());
}
}
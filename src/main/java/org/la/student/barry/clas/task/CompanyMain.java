package org.la.student.barry.clas.task;

public class CompanyMain {

	public static void main(String[] args) {
	   Company company= new Company();
	   
	  company.setCompanyId(152);
	   company.setName("Barry");
	   company.setDescription("MWD");
		int CompanyId= company.getCompanyId();
		String name= company.getName();
		String description= company.getDescription();
		System.out.println("id :" +CompanyId);
		System.out.println("name: "+name);
		System.out.println("Description :"+ description);

		
		
	}
            
}

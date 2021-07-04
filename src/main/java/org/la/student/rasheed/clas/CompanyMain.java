package org.la.student.rasheed.clas;

public class CompanyMain {

	public static void main(String[] args) {
		
		Company company = new Company();
		company.setId(4);
		company.setname("Toyota");
		company.setdescription("Network Engineer");
		
		
		int companyId = company.getId();
		String name = company.getname();
		String description = company.getdescription();
		
		
		
		System.out.println("Company Id = "+companyId);
		System.out.println("name = "+name);
		System.out.println("description = "+description);
		
		

	}

}

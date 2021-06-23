package org.la.student.bakil.objects;

public class CompanyMain {

	public static void main(String[] args) {
		
		Company company = new Company();
		company.setId(112);
		company.setName("DATA KRAF SDN BHD");
		company.setDescription("IT COMPANY");
		
		//admin.display();
		int id = company.getId();
		String name = company.getName();
		String description = company.getdescription();
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Description: "+description);
	}
}


package org.la.student.kayes.methods;

public class ComapnyMain {

	public static void main(String[] args) {
		Company com=new Company();
		com.setId(10);
		com.setname("ROMAN");
		com.setdescriptrion("Software Engineer");
		
		int companyId=com.getId();
		String name=com.getname();
		String description=com.getdescription();
		
		System.out.println("COMPANY ID =  "+companyId);
		System.out.println("NAME =  "+name);
		System.out.println("DESCRIPTION = "+description);
	

	}

}

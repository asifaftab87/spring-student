package org.la.student.abdullahi.methods.setters.getters;

public class CompanyMain {



 public static void main(String[] args) {

	 Company company= new Company();
	 company.setId(1);
	 company.setName("ROLEX");
	 company.setDescription("Software");
	 
	 int CompanyId=company.getId();
	 String Name=company.getName();
	 String Description=company.getDescription();
	 
	 System.out.println("Company Id= "+ CompanyId);
	 System.out.println("Company Name= "+ Name);
	 System.out.println("Company Description= "+ Description);
 }
}
package org.la.student.jamal.clas;
/*
 * 1.	Create a class Company having member variables companyId, name, description. create getters and 
		setters for all member variables. Create object of Company class in other class inside main method
		and set all member values and print all member values using getters.
 */

public class Company {
	
	private String name;
	private int companyId;
	private String description;
	
	public String getName() {
		return name;
	} 
	
	public int getCompanyId() {
		return companyId;
	}
	
	public String getDescription() {
		return description;
	}
	public void display() {
		System.out.println();
		System.out.println("Name: "+name+"CompanyId: "+companyId+ " Dscription: "+description);
		
	}
	public void set(String n,int i,String d) {
		name=n;
		companyId=i;
		description=d;
		 
		
		
	}
	
	

}

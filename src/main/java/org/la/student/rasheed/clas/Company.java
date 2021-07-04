package org.la.student.rasheed.clas;


/*
 * Create a class Company having member variables companyId, name, description. 
 * create getters and setters for all member variables. 
 * Create object of Company class in other class inside main method and set all member values and print all member values using getters.
 */

public class Company {
	
	private int companyId;
	private String name;
	private String description;
	
	
	public int getId() {
		return companyId;
	}
	public String getname() {
		return name;
		
	}
	public String getdescription() {
		return description;
		
	}
	public void setId (int i) {
		companyId=i;
	}
	public void setname (String n) {
		name=n;
	}
	public void setdescription (String d) {
		description = d;

}
}
	

package org.la.student.bakil.objects;
/*
 * Create a class Company having member variables companyId, name, description. create getters and 
   setters for all member variables. Create object of Company class in other class inside main method
   and set all member values and print all member values using getters.
 */
public class Company {

	private int companyId;
	private String name;
	private String description;
	
	public int getId() {
		return companyId;
	}
	
	public void setId(int i) {
		companyId = i;
	}
	
	public void setName(String p) {
		name = p;
	}
	
	public String getName() {
		return name;
	}
	
	public void setDescription(String n) {
		description = n;
	}
	
	public String getdescription() {
		return description;
	}
	
	public void display() {
		System.out.println("id: "+companyId+"  name: "+name+"  description: "+description);
	}
}
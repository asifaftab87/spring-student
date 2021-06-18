package org.la.student.noor;
/*Create a class Company having member variables companyId, name, description. create getters and 
		setters for all member variables. Create object of Company class in other class inside main method
		and set all member values and print all member values using getters.*/


public class Company {
	private int companyId;
	private String name;
	private String description;
	
	
	public void setcompanyId(int i) {
		companyId=i;
	}
	
	public int getCompanyId() {
		return companyId;
	}
	
	
	public void setName(String n) {
		name=n;
	}

	public String getName() {
		return name;
	}
		
	
	public void setDescription(String d) {
		description=d;
	}
	
		public String getDescription() {
			return description;
		}
		
	public void display() {
		System.out.println("companyId:" +companyId);
		System.out.println("name:" +name);
		System.out.println("description:" +description);
	}
	

}

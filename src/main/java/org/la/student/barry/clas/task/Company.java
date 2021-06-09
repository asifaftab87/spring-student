package org.la.student.barry.clas.task;

public class Company {
	/*
	 * Create a class Company having member variables companyId, name, description. create getters and 
		setters for all member variables. Create object of Company class in other class inside main method
		and set all member values and print all member values using getters.
	 */

	private int companyId;
	private String name;
	private String description;
	
	public int getCompanyId() {
		return companyId;
	}
	  public void setCompanyId(int i) {
		  companyId=i;
	  }
	  public String getName() {
			return name;
		}
		  public void setName(String n) {
			 name=n;
		  }
		  public String getDescription() { 
				return description;
			}
			  public void setDescription(String d) {
				  description=d;
			  }
			  public void display() {
				 
			  System.out.println("companyId: "+companyId+"   name:  "+name+ "   description:  "+description);
			  }
}

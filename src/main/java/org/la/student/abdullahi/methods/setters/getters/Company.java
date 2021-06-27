package org.la.student.abdullahi.methods.setters.getters;

public class Company {

	private int CompanyId;
	private String Name;
	private String Description;


       public int getId()
       {
	return CompanyId;
} 
       public String getName() {
    	   
    	   return Name;
       }
       public String getDescription() {
    	   
    	   return Description;
       }
       
       public void setId(int i) {
    	   CompanyId=i;
       }
       
       public void setName(String n) {
    	   Name=n;
       }
       public void setDescription(String d) {
    	   
    	   Description= d;
       }
}
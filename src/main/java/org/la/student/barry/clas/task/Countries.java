package org.la.student.barry.clas.task;

public class Countries {
	/*
	 * Create a class Countries having member variables code, name, continentName. create getters and 
		setters for all member variables. Create object of Countries class in other class inside main 
		method and set all member values and print all member values using getters.
		
	 */
	
	private int code;
	private String name;
	private String continentName;
	
	public int getCode() {
		return code;
	}
	 public void setCode(int i) {
		 code=i;
	 }
	 public String getName() 
	   {
			return name;
		}
		 public void setName(String n)
		 {
			 
			 name=n;
		 }
		 public String getContinentName()
         {
				return continentName;
		 }
			 public void setContinentName(String c)
			 {
				 continentName=c;
		   }

}

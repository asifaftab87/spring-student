package org.la.student.bakil.objects;
/*
 * Create a class Countries having member variables code, name, continentName. create getters and 
   setters for all member variables. Create object of Countries class in other class inside main method and set all member values 
	and print all member values using getters.
 */
public class Countries {

	private String code;
	private String name;
	private String continentName;
	
	
	//Code
	public void setCode(String c) {
		code =c;
	}
	public String getCode() {
		return code;
	}
	
	// Name 
	public void setName(String n) {
		name =n;
	}
	public String getName() {
		return name;
	}
	
	//Continent name 
	public void setContinentName(String k) {
		continentName=k;
	}
	public String getContinentName() {
		return continentName;
	}
	
	public void display() {
		System.out.println("Code :"+code+"Name :"+name+"Continent name :"+continentName);
	}
}

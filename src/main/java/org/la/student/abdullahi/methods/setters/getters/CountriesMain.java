package org.la.student.abdullahi.methods.setters.getters;

public class CountriesMain {

public static void main(String[]args) {
	
	Countries c = new Countries();
	c.setCode(212);
	c.setName("Zimbabwe");
	c.setContinentName("Africa");
	
	int Code = c.getCode();
	String Name = c.getName();
	String ContinentName = c.getContinentName();
	
	
	System.out.println("Code = " +Code);
	System.out.println("Name = " +Name);
	System.out.println("Continent Name = " +ContinentName);
}
}
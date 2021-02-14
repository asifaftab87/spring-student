package org.la.student.tahir.clas;

public class City {

	private String name;
	private String country;
	
	City(){
		
		System.out.println("This is a default constructor");
		
		
		
	}
	
	City(String s){
		
		System.out.println("1 parameter Constructor");
	}
	
	City (String name ,String country){
		this(" ");
		System.out.println("This parametized Constructor");
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		
		this.country= country;
	}
	
	public void setValues(String a, String b) {
		
		name=a;
		country=b;
	}
	
	public void show() {
		
		System.out.println("Name: "+ name + "  Country: "+ country);
	}
	
	
}

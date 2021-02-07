package org.la.student.asif.clas;

public class City {

	private String name;
	private String country;
	
	public City() {
		this("sdfa");
		System.out.println("Default constructor");
	}
	
	public City(String n, String c) {
		name = n;
		country = c;
		System.out.println("This is parameterized constructor"); 
	}
	public City(String n) {
		System.out.println("1 parameter constructor");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public void show() {
		System.out.println("name: "+name+"   Country name: "+country);
	}
	
	public void setValues(String n, String c) {
		name = n;
		country = c;
	}
}

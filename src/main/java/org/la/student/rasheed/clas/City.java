package org.la.student.rasheed.clas;

/*
 * Create a class City having member variables id, city. create getters and 
		setters for all member variables. Create object of City class in other class inside main method
		and set all member values and print all member values using getters.
 */

public class City {

	
	private String city;
	private int Id;
	
	public String getcity() {
		return city;
	}
	public int getId() {
		return Id;
		
	}
	public void setcity (String c) {
		city = c;
	}
	public void setId (int i) {
		Id = i;
	}
	public void display() {
		System.out.println("city : "+city+" Id : "+Id);
	}
	

}

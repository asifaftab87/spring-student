package org.la.student.bakil.objects;
/*
 * Create a class City having member variables id, city. create getters and 
   setters for all member variables. Create object of City class in other class inside main method
   and set all member values and print all member values using getters.
 */
public class City {

	
	private int id;
	private String cityName;
	
	public void setId(int i) {
		id=i;
	}
	public int getId() {
		return id;
	}
	
	public void setcityName(String c) {
		cityName =c;
	}
	public String getCity() {
		return cityName;
	}
	
	public void display() {
		
		System.out.println("Id :"+id + "City :"+cityName);
		
	}
}

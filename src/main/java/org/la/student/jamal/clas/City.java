package org.la.student.jamal.clas;
/*8.	Create a class City having member variables id, city. create getters and 
		setters for all member variables. Create object of City class in other class inside main method
		and set all member values and print all member values using getters.
 * 
 */

public class City {
	
	private int id;
	private String city;
	
	public void set(int i,String c) {
		id=i;
		city=c;
		
	}
	
	public int getId() {
		return id;
	}
	
	public String getCity() {
		return city;
	}
	
	public void display() {
		System.out.println("ID: "+id+"City: "+city);
	}
	

}

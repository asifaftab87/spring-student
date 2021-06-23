package org.la.student.bakil.objects;
/*
 * Create a class Dimensions having member variables id, dimensionValue. create getters and 
	setters for all member variables. Create object of Dimensions class in other class inside main method
	and set all member values and print all member values using getters.
 */
public class Dimensions {

	
	private int id ;
	private String dimensionValue;
	
	
	// Id 
	public void setId(int i) {
		id =i;
	}
	public int getId() {
		return id;
	}
	
	// Dimension value 
	public void setDimensionValue (String d) {
		dimensionValue =d;
	}
	public String getDimensionValue() {
		return dimensionValue;
	}
	
	public void display() {
		System.out.println("Id :"+id+"Dimension value"+dimensionValue);
	}
	
}

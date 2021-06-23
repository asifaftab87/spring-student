package org.la.student.bakil.objects;
/*
 * Create a class Colors having member variables id, colorName. create getters and 
	setters for all member variables. Create object of Colors class in other class inside main method
	and set all member values and print all member values using getters.
 */
public class Colors {

	
	private int id;
	private String colorName;
	
	// Id 
	public void setID(int i) {
		id=i;
	}
	public int getId() {
		return id;
	}
	
	// Coor name 
	public void setColorName(String c) {
		colorName=c;
	}
	public String getColorName() {
		return colorName;
	}
	
	public void display() {
		System.out.println("Id :"+id+"Color name :"+colorName);
	}
}

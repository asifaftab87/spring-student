package org.la.student.bakil.objects;
/*
 * Create a class Finish having member variables id, finishName. create getters and 
    setters for all member variables. Create object of Finish class in other class inside main method
	and set all member values and print all member values using getters.
 */
public class Finish {



	private int id;
	private String finishName;
	
	
	// Id 
	public void setId(int i) {
		id =i;
	}
	public int getId() {
		return id;
	}
	
	// Finish name 
	public void setFinishName(String f) {
		finishName=f;
	}
	public String getFinishName() {
		return finishName;
	}
	
	public void display() {
		System.out.println("Id :"+id+"Finish name :"+finishName);
	}
}

package org.la.student.barry.clas.task;

public class Brands {
	/*
	 * Create a class Brands having member variables id, brandName, thumbnails. create getters and 
		setters for all member variables. Create object of Brands class in other class inside main method
		and set all member values and print all member values using getters.
	 */

	private int id;
	private String brandName;
	private String thumbNails;
	
	public int getId() {
		return id;
	
	}
	public void setId(int i) {
		id=i;
	}

	public String getBrandName() {
		return brandName;
	
	}
	public void setBrandName(String b) {
		brandName=b;
	}

	public String getThumbNails() {
		return thumbNails;
	
	}
	public void setThumbNails(String t) {
		thumbNails=t;
	}
}

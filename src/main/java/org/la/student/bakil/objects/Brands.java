package org.la.student.bakil.objects;
/*
 * Create a class Brands having member variables id, brandName, thumbnails. create getters and 
	setters for all member variables. Create object of Brands class in other class inside main method
	and set all member values and print all member values using getters.
 */
public class Brands {

	
	private int id;
	private String brandName;
	private String thumbnails;
	
	// Id
	public void setId(int i) {
		id=i;
	}
	public int getId() {
		return id;
	}
	
	//Brand name 
	public void setBrandName(String b) {
		brandName=b;
	}
	public String getBrandName() {
		return brandName;
	}
	
	//Thumbnails
	public void setThumbnails(String t) {
		thumbnails=t;
	}
	public String getThumbnails() {
		return thumbnails;
	}
	
	public void display() {
		System.out.println("Id :"+id +"Brand name :"+brandName+"Thumbnails :"+thumbnails);
	}
}

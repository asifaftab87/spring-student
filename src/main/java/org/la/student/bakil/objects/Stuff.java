package org.la.student.bakil.objects;
/*
 * Create a class Stuff having member variables id, stuffName, thumbnails. create getters and 
	setters for all member variables. Create object of Stuff class in other class inside main method
	and set all member values and print all member values using getters.
 */
public class Stuff {

	
	private int id;
	private String stuffName;
	private String thumbnail;
	
	
	// Id
	public void setId(int i) {
		id =i;
	}
	public int getId() {
		return id;
	}
	
	// Stuff name 
	public void setStuffName(String s) {
		stuffName=s;
	}
	public String getStuffName() {
		return stuffName;
	}
	
	// Thumbnail
	public void setThumbnail(String h) {
		thumbnail=h;
	}
	public String getThumbnail() {
		return thumbnail;
	}
	
	public void display () {
		System.out.println("Id :"+id+ "Stuff name :"+stuffName+"Thumbnail :"+thumbnail);
	}


}


package org.la.student.bakil.objects;
/*
 * Create a class Categorys having member variables id, categoryName, thumbnails. create getters and 
	setters for all member variables. Create object of Categorys class in other class inside main method and 
    set all member values and print all member values using getters.
 */
public class Categorys {

	
	private int id;
	private String categoryName;
	private String thumbnail;
	
	
	// Id 
	public void setId(int i) {
		id =i;
	}
	public int getId() {
		return id;
	}
	
	//Category name
	public void setCategoryName(String c) {
		categoryName =c;
	}
	public String getCategoryName() {
		return categoryName;
	}
	
	//Thumbnail
	public void setThumbnail(String t) {
		thumbnail =t;
	}
	public String getThumbnail() {
		return thumbnail;
	}
	
	public void display() {
		System.out.println("Id :"+id+"Category name :"+categoryName+"Thumbnail :"+thumbnail);
	}
}

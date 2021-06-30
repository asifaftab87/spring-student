package org.la.student.bakil.overloading_and_constructor;
/*
 * Brands having member variables id, brandName, thumbnails.
 */
public class Brands {

	
	private int id;
	private String brandName;
	private String thumbnails;
	
	Brands (){
		id=33123;
		brandName="H&M";
		thumbnails ="(^ - ^)";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getThumbnails() {
		return thumbnails;
	}

	public void setThumbnails(String thumbnails) {
		this.thumbnails = thumbnails;
	}
	
	public void display () {
		System.out.println("Id :"+id +"Brand name :"+brandName+"Thumbnail :"+thumbnails);
		
	}
}

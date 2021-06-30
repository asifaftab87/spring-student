package org.la.student.bakil.overloading_and_constructor;
/*
 * class Stuff having member variables id, stuffName, thumbnails
 */
public class Stuff {

	
	private int id;
	private String stuffName;
	private String thumbnail;
	
	public Stuff() {
		 id=332233;
		 stuffName="Bakil";
		 thumbnail="*__*";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStuffName() {
		return stuffName;
	}

	public void setStuffName(String stuffName) {
		this.stuffName = stuffName;
	}

	public String getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
	
	public void display() {
		System.out.println("Id :"+id +"Stuff name :"+stuffName+"Thumbnail :"+thumbnail);
	}
}

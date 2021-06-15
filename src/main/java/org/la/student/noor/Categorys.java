package org.la.student.noor;
/*
Create a class Categorys having member variables id, categoryName, thumbnails. 
create getters and setters for all member variables. Create object of Categorys class in other 
class inside main method and set all member values and print all member values using getters.*/


public class Categorys {
	private int id;
	private String categoryName;
	private String thumbNails;

	public int getId() {
		return id;
	}

	public void setId(int i) {
		id=i;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String c) {
		categoryName=c;
	}
	public String getThumbNails() {
		return thumbNails;
	}

	public void setThumbNails(String t) {
		thumbNails=t;
	}
	public void display() {
	System.out.println("Id: "+id);
	System.out.println("CategoryName: "+ categoryName);
	System.out.println("ThumbNails:"+thumbNails);

}
}

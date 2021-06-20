package org.la.student.rasheed.clas;

public class Admin {
	
	
	private int id;
	private String pwd;
	private String name;
	
	
	
	public int getId() {
		return id;
	}
	
	public void setId(int i) {
		id = i;
	}
	
	public void setPwd(String p) {
		pwd = p;
		
		
	}
	public String getName() {
		return name;
	}
		
	
	public void setName(String n) {
		name = n;
	}
	
	public String getPwd() {
		return pwd;
	}
	
	public void display() {
		System.out.println("id: "+id+"  pwd:  "+pwd+" name: "+name);
	}
	
	
	
		

}

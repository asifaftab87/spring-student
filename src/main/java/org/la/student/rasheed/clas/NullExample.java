package org.la.student.rasheed.clas;

public class NullExample {
	
	private int id;
	private String name; 
	private boolean c;
	private double d;
	
	
	public int getId() {
		return id;
		
		
		
	}
	public NullExample() {
		id =1;
		name ="karim";
		c = true;
		d =1;
	}
	public double getD() {
		return d;
	}
	public void setD(double d) {
		this.d = d;
	
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName () {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public  boolean getC () {
		return c;
	}
	public void set(boolean c) {
		this.c = c;
	}

}

package org.la.student.barry.clas;

public class NullExample {
	private int id;
	private String name;
	private boolean c;
	private double d;
	
	public NullExample() {
		id=1;
		name="karim";
		c=true;
		d=1;
	}
	public int getId() {
		return id;
		
	}
	public void setId(int id) {
		this.id=id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
    public boolean getC() {
    	return c;
    }
    public void setC(boolean c) {
    	this.c=c;
    }
    public double getD() {
    	return d;
    }
    public void setD(double d) {
    	this.d=d;
    }
}

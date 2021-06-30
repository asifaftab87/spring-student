package org.la.student.barry.inherit;

public class Square extends Shape {
	

	public Square () {
		super(4);
		System.out.println("Square constructor");
	}

	@Override 
	
	public void draw() {
		System.out.println("Square drawn");
	}
}

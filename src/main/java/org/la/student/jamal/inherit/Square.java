package org.la.student.jamal.inherit;

public class Square extends Shape {
	
	public Square() {
		System.out.println("Square constructor");
		
	}
		
	@Override
	public void draw() {
		System.out.println("Square drawn");
	}

}

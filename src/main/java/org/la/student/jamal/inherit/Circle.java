package org.la.student.jamal.inherit;

public class Circle extends Shape {
	
	public Circle() {
		System.out.println("circle constructor");
		
	}
	
	@Override
	public void draw() {
		System.out.println("Circle drawn");
	}

}

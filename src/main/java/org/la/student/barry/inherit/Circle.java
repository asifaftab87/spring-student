package org.la.student.barry.inherit;

public class Circle extends Shape {
	
	public Circle() {
		super(32);
		System.out.println("Circle constructor");
	}
	
	@Override
	public void draw() {
		//Shape shape= new Shape();
		System.out.println("Circle drawn");
		super.draw();
	}

}

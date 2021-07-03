package org.la.student.noor.inherit;

public class Circle extends Shape {
	public Circle() {
		super(5);
		System.out.println("circle constructor");
	}
	@Override
	public void draw() {
		System.out.println("Circle drawn");
		super.draw();
	}
}

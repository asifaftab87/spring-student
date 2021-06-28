package org.la.student.asif.inherit;

public class Circle extends Shape {

	public Circle() {
		super(32);
		System.out.println("circle constructor");
	}
	@Override
	public void draw() {
		System.out.println("circle drawn");
		super.draw();
	}
}

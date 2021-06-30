package org.la.student.barry.inherit;

public class Triangle extends Shape {
	

	public Triangle() {
		super(3);
		System.out.println("Triangle constructor");
	}

	@Override
	public void draw() {
		System.out.println("Triangle drawn");
	}
}

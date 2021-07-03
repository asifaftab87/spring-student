package org.la.student.noor.inherit;

public class Square extends Shape {
	public Square() {
		super(4);
		System.out.println("square constructor");
	}
	@Override
	public void draw() {
		System.out.println("Square drawn");
	}
}

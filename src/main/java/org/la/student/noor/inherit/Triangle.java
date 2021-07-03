package org.la.student.noor.inherit;

public class Triangle extends Shape{
	public Triangle() {
		super(3);
		System.out.println("triangle constructor");
	}
	@Override
	public void draw() {
		System.out.println("triangle drawn");
	}

}

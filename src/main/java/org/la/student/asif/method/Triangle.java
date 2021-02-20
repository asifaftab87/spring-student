package org.la.student.asif.method;

import org.la.student.asif.inherit.Shape;

public class Triangle extends Shape {

	public Triangle() {
		System.out.println("default Triangle constructor child");
		super.draw();
	}
	
	public Triangle(int id) {
		super(id);	//specific parent constructor, 1 int value
		System.out.println("parameterized Triangle constructor child id: "+id);
		draw();
	}
	
	@Override
	public void draw() {
		System.out.println("this is Triangle.draw method child");
	}
	
}

package org.la.student.asif.inherit;

public class Shape {

	public Shape() {
		System.out.println("default Shape constructor parent");
	}
	public Shape(int i) {
		System.out.println("parameterized Shape constructor parent i: "+i);
	}
	public void draw() {
		System.out.println("this is Shape.draw method parent");
	}
}

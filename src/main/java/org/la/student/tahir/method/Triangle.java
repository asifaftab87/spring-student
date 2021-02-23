package org.la.student.tahir.method;

import org.la.student.tahir.inheritance.Shape;

public class Triangle extends Shape {

	public Triangle() {
		System.out.println("Default constrctor of Triangle class");
		super.Draw();
	}
	
public void Draw() {
		
		System.out.println("Draw method of Triangle class");
	}
}

package org.la.student.tahir.method;

import org.la.student.tahir.inheritance.Shape;

public class Triangle extends Shape {

	public Triangle() {
		System.out.println("Default constrctor of Triangle class");
		super.Draw();
	}
	
	public Triangle(int id){
		super(id);
		System.out.println("Parametized constructor of Triangle class, id= " + id);
	}
	
public void Draw() {
		
		System.out.println("Draw method of Triangle class");
	}
}

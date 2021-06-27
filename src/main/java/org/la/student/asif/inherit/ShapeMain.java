package org.la.student.asif.inherit;

public class ShapeMain {

	public static void main(String[] args) {
		
		Shape shape = new Triangle();
		shape.draw();
		
		shape = new Square();
		shape.draw();
		
		shape = new Circle();
		shape.draw();
	}
}

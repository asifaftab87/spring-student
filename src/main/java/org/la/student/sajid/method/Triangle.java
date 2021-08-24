package org.la.student.sajid.method;
import org.la.student.sajid.inherit.Squre;

public class Triangle extends Squre {
	
	public Triangle() {
		System.out.println("Default Triangle constructor child");
		super.draw();
	}
	
	public Triangle(int i) {
		super(i);
		System.out.println("Perametirezed Triangle constructor child i: "+i);
	}
	@Override
	public  void draw() {
		System.out.println("this is triangle,draw method child");
	}

}

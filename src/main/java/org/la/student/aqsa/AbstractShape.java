package org.la.student.aqsa;

public abstract class AbstractShape {

	abstract void rectangleArea(int l, int b);
	abstract void squareArea(int s);
	abstract void circleArea(int r);
}
class Area extends AbstractShape{

	@Override
	void rectangleArea(int l, int b) {
		
		double area = l*b;
		System.out.println(area);
	}

	@Override
	void squareArea(int s) {
		double area= s*s;
		System.out.println(area);
		
	}

	@Override
	void circleArea(int r) {
		double area = 3.14*r*r;
		System.out.println(area);
		
	}
	
	public static void main(String[] args) {
	Area obj = new Area();
	obj.rectangleArea(5,6);
	obj.squareArea(12);
	obj.circleArea(8);
	
	}
}


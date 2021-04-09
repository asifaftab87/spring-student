package org.la.student.aqsa;

public abstract class Abstract7 {

	abstract void rectangleArea(int l, int b);
	abstract void squareArea(int s);
	abstract void circleArea(int r);
}
class Area7 extends AbstractShape{

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
	Area rectangle[] = new Area[4];
	rectangle[0] = new Area();
	rectangle[1] = new Area();
	rectangle[2] = new Area();
	rectangle[3] = new Area();
	
	System.out.println("Area of 4 Rectangle");
	
	rectangle[0].rectangleArea(2,3);
	rectangle[1].rectangleArea(2,4);
	rectangle[2].rectangleArea(2,5);
	rectangle[3].rectangleArea(2,6);
	
	Area[] square = new Area[4];
	square[0] = new Area();
	square[1] = new Area();
	square[2] = new Area();
	square[3] = new Area();
	
	System.out.println("");
	System.out.println("Area of 4 Square");
	
	square[0].squareArea(3);
	square[1].squareArea(4);
	square[2].squareArea(5);
	square[3].squareArea(6);
	
	Area[] circle = new Area[5];
	circle[0] = new Area();
	circle[1] = new Area();
	circle[2] = new Area();
	circle[3] = new Area();
	circle[4] = new Area();
	
	System.out.println("");
	System.out.println("Area of 5 Circle");
	
	circle[0].circleArea(9);
	circle[1].circleArea(7);
	circle[2].circleArea(4);
	circle[3].circleArea(5);
	circle[4].circleArea(6);
	
	}
}

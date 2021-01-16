package org.la.student.aameen.method;



public class Rectangle {

	public static void main(String[] args) {
		// Write a java program to create method that accept the side of rectangle and return perimeter.
		
		
		float a,b,c,d;
		a=c=5;
		b=d=4;
		
		System.out.println("Perimeter of rectangle : " +side(a,b));
		
	}
	static float side(float a , float b )
	{
		float perimeter = 2*(a+b);
		return perimeter;
	}
	
}

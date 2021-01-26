package org.la.student.tahir.method;

public class Areaandcircumferenceofacircle {
	// Area and Circumference of a circle.
	public static void main(String[] args) {
		
		int radius =3;
		
		System.out.println("The area of the circle is: "+Area(radius));
	
		System.out.println("The Circumference of the circle is: "+Circumference(radius));
		
	}
	
	
	static double Area (double a) {
		
		double pi = 3.14;
		double A= pi*(a*a);
		return A;
		
	}
	
	static double Circumference( double a)  {
		double pi = 3.14;
		double C= 2*pi*a;
		return C;
		
		
	}

}

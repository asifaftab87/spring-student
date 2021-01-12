package org.la.student.tahir.method;

public class Simpleinterest {
	// Simple interest
	public static void main(String[] args) {
		
		double p =3000;
		double r = 4;
		double t= 1;
		
		System.out.println("The Simple interest of the year is: " + interest(p,r,t));
	
		
		
	}
	
	
	static double interest (double a, double b, double c ) {
		
		
		double SI= (a*b*c)/100;
		return SI;
		
	}
	

	

}

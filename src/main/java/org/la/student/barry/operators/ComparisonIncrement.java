package org.la.student.barry.operators;

public class ComparisonIncrement {

	public static void main(String[] args) {
	  
		int x= 1;
		int y= 2;
		
		boolean r= x++ == y;
		
		System.out.println("x: "+x);
		System.out.println("y: "+y);
		System.out.println("r: "+r);
		

	}

}

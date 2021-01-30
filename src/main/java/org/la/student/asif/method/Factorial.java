package org.la.student.asif.method;

public class Factorial {

	public static void main(String[] args) {
		
		int f = 4;
		factorial(f);
		
	}
	
	static void factorial(int n) {
		int f = 1;
		
		while(n>0) {
			f = f * n;
			n = n - 1;
		}
		
		System.out.println("factorial: "+f);
	}
}

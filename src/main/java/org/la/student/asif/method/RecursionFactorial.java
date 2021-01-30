package org.la.student.asif.method;

public class RecursionFactorial {

	public static void main(String[] args) {
		
		int f = 4;
		
		int result = factorial(f);
		System.out.println("factorial of "+f+ " is "+result );
	}
	
	
	static int factorial(int n) {
		
		if(n==1) {
			return 1;
		}
		
		return n * factorial(n-1);
	}
}

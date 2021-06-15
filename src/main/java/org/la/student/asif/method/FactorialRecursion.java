package org.la.student.asif.method;

public class FactorialRecursion {

	public static void main(String[] args) {
		FactorialRecursion rc = new FactorialRecursion();
		int n = 5 ;
		int fact = rc.fact(n);
		System.out.println("factorial of "+n+" is: "+fact);
		while(true) {
			System.out.println("hello");
			int jj = 55;
		}
	}
	
	int fact(int n) {
		if(n==1) {
			return 1;
		}
		return n * fact(n-1);
	}
}

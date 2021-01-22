package org.la.student.tahir.method;

public class FactorialusingRecursion {
	//Factorial 
	public static void main(String[] args) {
		
		int fact;
		int num = 5;
		fact = factorial(num);
		System.out.println(fact);
	}
	
	
	static int factorial (int n) {
		
		if(n==0)
			return 1;
		else
			return (n*factorial(n-1));
	}
	
}

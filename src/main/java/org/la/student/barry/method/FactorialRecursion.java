package org.la.student.barry.method;

public class FactorialRecursion {
	 public static void main(String[] args) {
		FactorialRecursion rc = new FactorialRecursion();
		 int n=5;
		int fact= rc.fact(n);
		 System.out.println("Factorial of " + n +" is: "+ fact);
		
	}
	int fact (int n) {
		if(n==1) { 
			return 1;
		}
		return n*fact(--n);
		 }
		 
	 }



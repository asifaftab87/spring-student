package org.la.student.barry.clas.task;

public class Arithmetic {
	/*
	 * create a class of name Arithmetic, add methods like add, sub, div, prod, fibonacci,
	 *  prime, factorial. Plz make these methods return type and arguments according to your wish.
	 */
// 
	public int add(int a, int b) {
		return a+b;
	}
	
	public int sub(int a, int b) {
		return a-b;
	}
	
	public double div(double a, double b) {
		return a/b;
	}
	public int prod(int a, int b) {
		return a*b;
	}
	
	public void fibonacci(int n ) {
		int a=0, b=1, c;
		for(int i=1; i<=n; i++) {
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	
	}
	public void prime(int i) {
		                                 
		int j=2;
		while(j<i) {
			if (i%j==0) {
				break;
			}
			j++;
		}
		if(i==j) {
			System.out.println(i+": is Prime number");
		}else {
			System.out.println(i+": is Not Prime number");
		}
		
	}
	public void factorial(int n) {
		int f = 1;
	      
	     for(; n>=1; n--) {
	    	  
	    	  f= f*n;
	       } 
	       System.out.println("Factorial:" +f);
		}
}

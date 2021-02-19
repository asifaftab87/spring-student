package org.la.student.sadique;

public class FindFactorialNumberUsingWhileLoop {

	public static void main(String[] args) {
		// wap to find factorial of a given number using while loop.
		int n=5,m;
		int f=1;
		m=n; 
		while(n>1) {
			if(n%1==0)
			f=f*n;
			n--;
		}
		    System.out.println(f+" is Factorial of " + m);
	}

}

package org.la.student.sadique;

public class CheekNumberIsPrimeOrNotUsingWhileLoop {

	public static void main(String[] args) {
		// wap to find given number is prime or not using while loop.
		int n=23;
		int tmp=0;
		int a=2;
		while(a<=n-1) {
			
			if(n%a==0) {
				tmp=tmp+1;
		}
			a++;
		}
		    if(tmp==0) {
			System.out.println(n+ " is prime number ");
			
		}   else
			System.out.println(n+ " is not prime number ");

	}

}

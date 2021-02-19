package org.la.student.sadique;

public class FindFactorialOfNumber {

	public static void main(String[] args) {
		// Wap to calculate factorial of a number.
		int n=5;
		int f=1;
		while(n>1) {
			f=f*n;
			n--;
		}
		System.out.println(f);

	}

}

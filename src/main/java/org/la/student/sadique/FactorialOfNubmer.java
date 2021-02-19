package org.la.student.sadique;

public class FactorialOfNubmer {
	//Wap to calculate factorial of a number.
	public static void main(String[] args) {
		int n=5;
		int f=1;
		while(n>0) {
			f=f*n;
			n--;
		}
		System.out.println("Factorial of 5 :"+f);
	}

}

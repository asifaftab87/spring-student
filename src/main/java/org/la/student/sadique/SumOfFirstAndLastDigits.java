package org.la.student.sadique;

public class SumOfFirstAndLastDigits {

	public static void main(String[] args) {
		// Wap to find sum of first and last digit of a number.
		int a=2339,b,c=0;
		b=a%10;
		while(a>10) {
			a=a/10;
			c=a;
		}System.out.println(b+"last digit");
		System.out.println(c+ "first digit");
	    System.out.println(b+c);

	}

}

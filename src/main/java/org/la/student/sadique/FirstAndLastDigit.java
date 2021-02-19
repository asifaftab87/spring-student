package org.la.student.sadique;

public class FirstAndLastDigit {

	public static void main(String[] args) {
		// Wap to find first and last digit of a number.
		int a=923,b,s=0;
		b=a%10;
		while(a>10) {
			a/=10;
			s=a;
		}System.out.println(b+ " : last digit");
		System.out.println(s+ " : first digit");

	}

}


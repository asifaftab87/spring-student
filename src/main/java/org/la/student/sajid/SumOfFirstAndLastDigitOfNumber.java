package org.la.student.sajid;

public class SumOfFirstAndLastDigitOfNumber {
	public static void main(String[] args) {
//		Wap to find sum of first and last digit of a number.
		int n=1234;
		int c=0,s=0;
		s=n;
		while(n>=10) {
			n=n/10;
				}
			System.out.println("first digit number "+n);		
			while(s>=10) {
				s=s%10;
			}System.out.println("Last Digit number "+s);
	}
}

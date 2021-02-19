package org.la.student.sadique;

public class CalaulateTheDigitOfProduct {
	//Wap to calculate product of digits of a number.
	public static void main(String[] args) {
		int a=1234;
		int b=1;
		for(;a>10;) {
			int c=a%10;
			a=a/10;
			b=b*c;
		}
		System.out.println("Prouduct of digit :"+b);
	}

}

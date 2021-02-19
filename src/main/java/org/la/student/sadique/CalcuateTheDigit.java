package org.la.student.sadique;

public class CalcuateTheDigit {

	public static void main(String[] args) {
		// Wap to calculate product of digits of a number.
		int a = 123;
		int b = 1;
		for (; a > 10;) {
			int r = a % 10;
			a = a / 10;
			b = b * r;

		}
		System.out.println("product of all digits = " + b);
		hello();
	}

	public static void hello() {
		System.out.println();
		System.out.println("From method hello");
		
	}
}

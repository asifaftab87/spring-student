package org.la.student.sadique;

public class SumOfDigitsOfNumber {
	public static void main(String[] args) {
//		Wap to calculate sum of digits of a number.
		int a=66666;
		int b=0;
		for( ;a>0; ) {
			int r=a%10;
			a=a/10;
			b=b+r;
		}System.out.println("sum of all digits"+b);
		
	}

}

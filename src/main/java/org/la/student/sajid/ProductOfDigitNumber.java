package org.la.student.sajid;

public class ProductOfDigitNumber {
	public static void main(String[] args) {
//		Wap to calculate product of digits of a number.
		int num=1234,s=1;
		while(num!=0) {
			s=s*(num%10);
			num/=10;
		}System.out.println(s);
	}

}

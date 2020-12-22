package org.la.student.sajid;

public class CalculateSumDigitNumber {
	public static void main(String[] args) {
//		Wap to calculate sum of digits of a number.
		int num=4572,s=0;
		while(num!=0) {
			s=s+num%10;
			num=num/10;
		}System.out.println(s);
	}

}

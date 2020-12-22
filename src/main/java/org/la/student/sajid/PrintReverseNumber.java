package org.la.student.sajid;

public class PrintReverseNumber {
	public static void main(String[] args) {
//		Wap to enter a number and print its reverse.
		int num=1234,r=0;
		while(num!=0) {
			int d=num%10;
				r=r*10+d;
				num/=10;
		}System.out.println(r);
	}

}

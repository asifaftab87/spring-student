package org.la.student.sadique.loop;
//wap to find sum of a number e.g ip=1234,  op=10
public class SumOfDigits {
	public static void main(String[] args) {
		int z=12345;
		int w=z;
		int s=0;
		for(;z>0;) {
			int r=z%10;
			z=z/10;
			s=s+r;
		}
		System.out.println("Sum of All Digits of "+ w + " is "+ s);


	}

}

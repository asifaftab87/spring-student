package org.la.student.sadique;

public class WhileLoop05 {

	public static void main(String[] args) {
		// 5.	wap to print even number among two given numbers( using if and else).
		int c=24;
		int d=13;
		if(c%2==0) {
			System.out.println(c+ " is even");
		} if(d%2==0) {
			System.out.println(d+ " is even");
		}
// without if else
	int e=(c%2==0)?c:(d%2==0?d:0);{
		System.out.println(e+" is even");
	}
	}

}

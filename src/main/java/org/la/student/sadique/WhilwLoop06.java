package org.la.student.sadique;

public class WhilwLoop06 {

	public static void main(String[] args) {
		// 6.	wap to print odd number among two given numbers( using if and else ).
		int a=25;
		int b=21;
		if(a%2!=0) {
			System.out.println(a+ " is odd ");
		}if(b%2!=0) {
			System.out.println(b+ " is odd ");
		}
//without if else
		int c=(a%2!=0)?a:(b%2!=0?b:0);{
			System.out.println(c+" is odd ");
		}
	}

}

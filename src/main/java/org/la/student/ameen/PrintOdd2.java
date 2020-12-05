package org.la.student.ameen;

public class PrintOdd2 {

	public static void main(String[] args) {
		// wap to print odd number among two given numbers(  without if).
		int a = 27 , b = 24;
		int oddnumber = a%2!=0?a:(b%2!=0?b:0);
		System.out.println("odd number " +oddnumber);

	}

}

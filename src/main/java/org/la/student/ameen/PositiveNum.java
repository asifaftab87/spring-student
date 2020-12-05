package org.la.student.ameen;

public class PositiveNum {

	public static void main(String[] args) {
		// wap to print positive number among two given numbers( without if ).
		int a = 78, b = -65;
		int positivenumber = a>0?a:(b>0?b:0);
		System.out.println("positive number : " +positivenumber);

	}

}

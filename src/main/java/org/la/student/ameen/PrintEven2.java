package org.la.student.ameen;

public class PrintEven2 {

	public static void main(String[] args) {
		// wap to print even number among two given numbers(  without if).
		int num1 = 34, num2 = 27;
		int evennumber = num1%2==0? num1:(num2%2==0?num2:0);
		System.out.println("even number : " +evennumber);

	}

}

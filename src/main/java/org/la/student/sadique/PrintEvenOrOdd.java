package org.la.student.sadique;

public class PrintEvenOrOdd {

	public static void main(String[] args) {
		// wap to print odd if number is odd and even if number is even
		// using if and else.
		int z=15;
		if(z%2==0) {
			System.out.println(z + " is even number ");
		}else {
			System.out.println(z + " is odd number ");
		}

		//using without if and else.
		int a=13;
		for(;a%2==0;) {
			System.out.println(a + " is even number");
			break;
		}
		for(;a%2!=0;) {
			System.out.println(a + " is odd number ");
			break;
			
		}
	}

}

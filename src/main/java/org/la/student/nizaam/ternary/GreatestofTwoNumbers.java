package org.la.student.nizaam.ternary;

public class GreatestofTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//wap to print greatest number among two given numbers( with if and without if).
		
		int a=5, b=8;
		
		//with if
		if(a>b) {
			System.out.println("greatest number is : "+a);
		}
		else
			System.out.println("greatest number is : "+b);
		
		a=10;b=6;
		
		//without if
		int c= (a>b) ? a : b;
		System.out.println("greatest number is : "+c);

	}

}

package org.la.student.nizaam.ternary;

public class SmallestofTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//wap to print smallest number among two given numbers( with if and without if).
		
		
		int a=5, b=8;
		
		//with if
		if(a<b) {
			System.out.println("smallest number is : "+a);
		}
		else
			System.out.println("smallest number is : "+b);
		
		a=10;b=6;
		
		//without if
		int c= (a<b) ? a : b;
		System.out.println("smallest number is : "+c);

	}

}

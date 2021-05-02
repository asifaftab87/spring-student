package org.la.student.nizaam.ternary;

public class PositiveAmongTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//wap to print positive number among two given numbers( with if and without if).
		
		int a=-5, b=8;
		
		//with if
		if(a>0) {
			System.out.println("positive number is : "+a);
		}
		else if(b>0)
			System.out.println("positive number is : "+b);
		else
			System.out.println("No positive number present");
		
		a=10;b=-6;
		
		//without if
		String c= (a>0) ? Integer.toString(a)  : ((b>0)? Integer.toString(b) :"No positive number present") ;
		
		System.out.println("positive number is : "+c);

	}

}

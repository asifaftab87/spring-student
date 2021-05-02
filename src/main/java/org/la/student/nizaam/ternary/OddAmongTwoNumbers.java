package org.la.student.nizaam.ternary;

public class OddAmongTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//wap to print odd number among two given numbers( with if and without if).
		
		int a=5, b=8;
		
		//with if
		if(a%2!=0) {
			System.out.println("odd number is : "+a);
		}
		else if(b%2!=0)
			System.out.println("odd number is : "+b);
		else
			System.out.println("No odd number present");
		
		a=10;b=7;
		
		//without if
		String c= (a%2!=0) ? Integer.toString(a)  : ((b%2!=0)? Integer.toString(b) :"No odd number present") ;
		
		System.out.println("odd number is : "+c);


	}

}

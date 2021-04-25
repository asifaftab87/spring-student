package org.la.student.nizaam.ternary;

public class EvenAmongTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//wap to print even number among two given numbers( with if and without if).
		
		int a=5, b=8;
		
		//with if
		if(a%2==0) {
			System.out.println("even number is : "+a);
		}
		else if(b%2==0)
			System.out.println("even number is : "+b);
		else
			System.out.println("No even number present");
		
		a=10;b=7;
		
		//without if
		String c= (a%2==0) ? Integer.toString(a)  : ((b%2==0)? Integer.toString(b) :"No even number present") ;
		
		System.out.println("even number is : "+c);

	}

}

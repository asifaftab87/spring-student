package org.la.student.nizaam.ternary;

public class NegativeAmongTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//wap to print negative number among two given numbers( with if and without if).
		
		int a=-5, b=8;
		
		//with if
		if(a<0) {
			System.out.println("negative number is : "+a);
		}
		else if(b<0)
			System.out.println("negative number is : "+b);
		else
			System.out.println("No negative number present");
		
		a=10;b=-6;
		
		//without if
		String c= (a<0) ? Integer.toString(a)  : ((b<0)? Integer.toString(b) :"No negative number present") ;
		
		System.out.println("negative number is : "+c);


	}

}

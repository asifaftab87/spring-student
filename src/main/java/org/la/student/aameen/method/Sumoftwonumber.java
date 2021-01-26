package org.la.student.aameen.method;
	import java.util.Scanner;
public class Sumoftwonumber {

	public static void main(String[] args) {
				// Write a program to print the sum of two numbers entered by user by defining your own method.
		int a ,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		
	a = sc.nextInt();
	b=sc.nextInt();
	
	System.out.println("The sum of given two  number " +sum(a,b));;
		
	}
	static int sum(int x , int y )
	{
		return x + y ;
	}
	

}

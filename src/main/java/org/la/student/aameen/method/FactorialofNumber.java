package org.la.student.aameen.method;
 import java.util.Scanner;
public class FactorialofNumber {

	public static void main(String[] args) {
		// Write a program to print the factorial of a number by defining a method named 
		
		int num ;
		Scanner scnr = new Scanner(System.in);
		num = scnr.nextInt();
		System.out.println("Enter the number");
		
		fact(num);
		
	}
	
	static void fact(int num)
	{
		int fact = 1; 
		for(int i=1;i<=num;i++)
		{
			 fact = fact*i;
			
		}
		System.out.println("Factorial of number : " +fact);
		return;
	}
	

}

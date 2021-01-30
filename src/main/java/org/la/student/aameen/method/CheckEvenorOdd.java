package org.la.student.aameen.method;
import java.util.Scanner;
public class CheckEvenorOdd {

	public static void main(String[] args) {
		// Write a program in java to check a given number is even or odd using the method.
		
		Scanner sc = new Scanner(System.in);
		int num ;
		System.out.println(" Enter the value of num ");
		num=sc.nextInt();
		
		
		 check(num);
		 
	}
	static void check(int a)
	{
		if(a%2==0)
		{
			System.out.println("The given number is even");
		}
		else 
		{
			System.out.println(" The given number is odd");
		}
		return ;
	}

}

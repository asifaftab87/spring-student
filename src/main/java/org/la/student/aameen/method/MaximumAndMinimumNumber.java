package org.la.student.aameen.method;
 import java.util.Scanner;
public class MaximumAndMinimumNumber {

	public static void main(String[] args) {
		// Define two methods to print the maximum and the minimum number respectively among three numbers entered by user.
		
		int num1 , num2, num3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of num1 , num2,num3");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		max(num1,num2,num3);
		min(num1,num2,num3);
	}
	static void max(int a , int b , int c )
	{
		
		if(a>b&&a>c)
		{
			System.out.println("The Maximum number is : " +a);
		}
		else if(b>a&&b>c)
		{
			System.out.println(" The Maximum number is : " +b);
		}
		else
		{
			System.out.println("The Maximum number is : " +c);
			
		}
		return;
	}
	
	static void min(int x , int y , int z)
	{
		if(x<y&&x<z)
		{
			System.out.println("The Minimun number is : " +x);
		}
		else if(y<x&&y<z)
		{
			System.out.println("The Minimum number is :" +y);
		}
		else
		{
			System.out.println("The Minimum number is : " +z);
		}
		return;
	}

}

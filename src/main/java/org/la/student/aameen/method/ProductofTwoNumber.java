package org.la.student.aameen.method;
	import java.util.Scanner;
public class ProductofTwoNumber {

	public static void main(String[] args) {
		// Define a method that returns the product of two numbers entered by user.
		int a ,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values");
	 a = sc.nextInt();
	 b = sc.nextInt();
	 
	System.out.println("Product of two number " +prod(a,b));
	 
	}
		static int prod(int x , int y)
		{
			int prod = x*y;
			return prod;
		}
	
	
}

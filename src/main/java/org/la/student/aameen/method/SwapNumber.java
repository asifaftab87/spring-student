package org.la.student.aameen.method;
import java.util.Scanner;
public class SwapNumber {

	public static void main(String[] args) {
							// 2. Write a program in java to swap two numbers using method.
		
		int num1,num2;
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the value of numn1 and num2");
		
		num1=sc.nextInt();
		num2=sc.nextInt();
		
		swap(num1,num2);

	}
		static void swap(int a , int b)
		{
			int t = a ;
			a = b;
			b=t;
			System.out.println("num1 : " +a+ " num2 : " +b);
			return ; 
		}
		
		
		
		
		
	

}

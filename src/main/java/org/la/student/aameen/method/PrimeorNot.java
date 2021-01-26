package org.la.student.aameen.method;
 import java.util.Scanner;
public class PrimeorNot {

	public static void main(String[] args) {
		// Define a method to find out if number is prime or not.
		Scanner sc = new Scanner(System.in);
		
		int num ; 
		System.out.println("Enter the number ");
		num=sc.nextInt();
		
		prime(num);

	}
	static void  prime(int num)
	{
		int flag = 0;
		
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				System.out.println("It is not a prime number");
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("It is a prime number ");
		}
		return;
	}
	

}

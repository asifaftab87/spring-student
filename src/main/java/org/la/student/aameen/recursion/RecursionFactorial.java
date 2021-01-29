package org.la.student.aameen.recursion;

public class RecursionFactorial {

	public static void main(String[] args) {
		
		int f = 5;
			int result = factorial(f);
			System.out.println("factorial of given number " +f + " is : " +result);

	}
	 
	public static int factorial(int i )
	{
		if(i==1)
		{
			
			return 1;
		}
		return i*factorial(i-1);
	}

}

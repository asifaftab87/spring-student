package org.la.student.ameen;

public class Factorial {

	public static void main(String[] args) {
		// Factorial of number
		int num = 5;
		int f = 1;
		while(num>1)
		{
			f=f*num ;
			num--;
		}
		
		System.out.println("factorial of given number : " +f);

	}

}

package org.la.student.ameen;

public class PowerofNumber {

	public static void main(String[] args) {
		// Wap to find power of a number using for loop.
		int base = 2, exponent = 4 ;
		long result =1;
		for(int i = 1;i<=exponent;i++)
		{
			result = result*base;
		}
		System.out.println("the number of " + base + " power " +exponent+ " = "+result);
	} 

}

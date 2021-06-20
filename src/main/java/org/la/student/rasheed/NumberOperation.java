package org.la.student.rasheed;

/*
 * how to find a given number is prime number or not
 */

public class NumberOperation {

	public static void main(String[] args) {
		
		//how to find prime number program?
		
		// you have pass the data type here, so it can called the data
		
		//How the program is working, it first come below (int a =107) and execute the program
		int a =107;
		//it jump from above line of (int a =107) to below and execute the program PRIME(11),  
		// when it realize this is not a simple statement, but 
		//a method it stop executing and jumps to the method you called, after it execute it
		//come to next line of code to execute
		prime(a);
		factorial(6);
	}
		// in which order we are writing a method it does matters
	//if factorial should be above or prime is below 
		
		// how to find Factorial of a number program
	static void factorial(int n) {
		int p= 1;
		for (int i=1; i<n; i++) {
			p=p*i;
		}
		System.out.println("Factorial of n is = "+p);

	}
	static void prime(int a) {
		
		int b =2;
		while (b < a) {
			if (a % b == 0) {
				break;
			}
			b++;
		}
		// Here it return the result and printing the value, 
		if (a == b) {
			System.out.println("is prime Number");
		}
		else {
			System.out.println("is Not Prime Number");
		}
	}

}

package org.la.student.bakil.class5tasks.for_loop;

/*
 * Wap to find sum of first and last digit of a number.
 */
public class Question56 {

	public static void main(String[] args) {
	
		int number = 2298;
		
		int first_digit = number;
		while(first_digit >= 10)
		{
			first_digit = first_digit / 10;
		}	
		
		int last_digit = number % 10;
		int sum = first_digit +last_digit;
		
		System.out.println("The sum of first and last digit   =  " +sum);
	}
}
	
	


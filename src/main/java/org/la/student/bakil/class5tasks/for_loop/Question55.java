package org.la.student.bakil.class5tasks.for_loop;

/*
 * Wap to find first and last digit of a number.
 */
public class Question55 {

	public static void main(String[] args) {
	
		int number = 2298;
		
		int first_digit = number;
		while(first_digit >= 10)
		{
			first_digit = first_digit / 10;
		}	
		
		int last_digit = number % 10;
		
		System.out.println("The First Digit  =  " + first_digit);
		System.out.println("The Last Digit   =  " + last_digit);
	}
}
	
	


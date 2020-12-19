package org.la.student.tahir.loop_programs;

public class For_Loop_49 {

	public static void main(String[] args) {
		//Wap to find sum of first and last digit of a number.
		
int number, first_digit, last_digit;
		
		number = 910764378;	
		
		first_digit = number;
		while(first_digit >= 10)
		{
			first_digit = first_digit / 10;
		}	
		
		last_digit = number % 10;
		
		System.out.println("\n The First Digit of a Given Number " + number + "  =  " + first_digit);
		System.out.println("\n The Last Digit of a Given Number " + number + "  =  " + last_digit);
		
		int sum = last_digit + first_digit;
		System.out.println("Sum of first and last digit  =  "+sum);
	}
	}



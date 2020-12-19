package org.la.student.tahir.loop_programs;

public class For_Loop_48 {

	public static void main(String[] args) {
	/*	 
        int number = 502356997;
        int firstDigit = 0;
        int lastDigit = 0;
        int count = 0;
 
        lastDigit = number%10;
        System.out.println("Last digit: "+lastDigit);
        int n = number;
        while(n!=0) {
            count++;
            n = n/10;
        }
        firstDigit = number/(int)Math.pow(10, count);
        System.out.println("First digit: "+firstDigit);
		*/
		
		
		// Wap to find first and last digit of a number.
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
	
	}
}


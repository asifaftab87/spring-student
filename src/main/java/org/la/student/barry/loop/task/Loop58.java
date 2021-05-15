package org.la.student.barry.loop.task;

public class Loop58 {
	
	//	Wap to find first and last digit of a number.
	public static void main(String[] args) {
		
		    int number = 487287389;
	        int firstDigit = 0;
	        int lastDigit = 0;
	 
	        lastDigit = number%10;
	        System.out.println("Last digit: "+lastDigit);
	 
	        while(number!=0) {
	            firstDigit = number%10;
	            number /= 10;
	        }
	        System.out.println("First digit: "+firstDigit);
     }
}

	
  

	
	

package org.la.student.bakil.class5tasks.for_loop;

/*
 * Wap to calculate sum of digits of a number.
 */
public class Question58 {

	public static void main(String[] args) {
	

        int m = 123, n, sum = 0;
		 
		 while(m > 0)
	        {
	            n = m % 10;
	            sum = sum + n;
	            m = m / 10;
	        }
	        System.out.println("Sum of Digits:"+sum);
	    }	
	}
	


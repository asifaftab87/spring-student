package org.la.student.bakil.class5tasks.for_loop;

/*
 * Wap to calculate product of digits of a number.
 */
public class Question59 {

	public static void main(String[] args) {
	
		int num=635 ;
	      int reverse =0;
	      
	      for( ;num != 0; )
	      {
	          reverse = reverse * 10;
	          reverse = reverse + num % 10;//3
	          num = num/10; 
	      }

	      System.out.println("Reverse of number is: "+reverse);
	   }
	}
	


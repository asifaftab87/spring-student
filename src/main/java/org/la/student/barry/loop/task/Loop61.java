package org.la.student.barry.loop.task;

import java.util.Scanner;

public class Loop61 {
	
	//Wap to calculate sum of digits of a number.
	public static void main(String[] args) {
		
		   int m, n, sum = 0;
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the number:");
	        m = sc.nextInt();
	        while(m > 0)
	        {
	            n = m % 10;
	            sum = sum + n;
	            m = m / 10;
	        }
	        System.out.println("Sum of Digits:"+sum);
     }
}

	
  

	
	

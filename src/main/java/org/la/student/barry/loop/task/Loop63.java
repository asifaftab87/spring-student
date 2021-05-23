package org.la.student.barry.loop.task;

import java.util.Scanner;

public class Loop63 {
	
	//Wap to enter a number and print its reverse.
	public static void main(String[] args) {
		
		 int n, reverse = 0;

		    System.out.print("Enter an integer to reverse the number:");
		    Scanner in = new Scanner(System.in);
		    n = in.nextInt();

		    while(n != 0)
		    {
		      reverse = reverse * 10;
		      reverse = reverse + n%10;
		      n = n/10;
		    }

		    System.out.println("Reverse of the number is :" + reverse);
     }
}

	
  

	
	

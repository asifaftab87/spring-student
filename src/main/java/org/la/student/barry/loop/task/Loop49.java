package org.la.student.barry.loop.task;

import java.util.Scanner;

public class Loop49 {
	
	// Wap to print all natural numbers in reverse (from n to 1)
	public static void main(String[] args) {
		
		
		int number,i;
		System.out.println("Enter The number:");
		Scanner sc= new Scanner(System.in);
	     number=sc.nextInt();
	     
		System.out.println(" The Natural Numbers Is In Reverse Order:");
		
		for(i=number;i>=1;i--) {
			System.out.print(" "+i);
	      }
     }
	

	}
  

	
	

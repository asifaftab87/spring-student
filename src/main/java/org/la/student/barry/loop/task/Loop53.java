package org.la.student.barry.loop.task;

import java.util.Scanner;

public class Loop53 {
	
	// 	Wap to find sum of all natural numbers between 1 to n.
	public static void main(String[] args) {
		
		   int sum = 0;
		      System.out.print("Enter the number value: ");
		      Scanner sc = new Scanner(System.in);
		      int num = sc.nextInt();

		      for (int i = 0; i<num; i++){
		         sum = sum +i;
		      }
		      System.out.println("Sum all natural numbers : "+sum); 
		
     }
	

	}
  

	
	

package org.la.student.barry.taks01;

import java.util.Scanner;

public class TaskLogicalOperation26 {	/* 
	 Ternary:
		wap to print greatest number among two given numbers( with if and without if).	
	*/

	public static void main(String[] args) {
		 int a, b, great;
	        Scanner scan = new Scanner(System.in);
			
	        System.out.print("Enter Two Number : ");
	        a = scan.nextInt();
	        b = scan.nextInt();
			
	        if(a>b)
	        {
	          great = a;
	        }
	        else
	        {
	           great = b;
	        }
			
	        System.out.print("Largest of Two Number is " +great);
		
	
	}
}

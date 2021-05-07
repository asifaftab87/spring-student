package org.la.student.barry.taks01;

import java.util.Scanner;

public class TaskLogicalOperation27 {	/* 
	 Ternary:
		wap to print greatest number among two given numbers( with if and without if).	
	*/

	public static void main(String[] args) {
		 int a, b, small;
	        Scanner scan = new Scanner(System.in);
			
	        System.out.print("Enter Two Number : ");
	        a = scan.nextInt();
	        b = scan.nextInt();
			
	        if(a<b)
	        {
	          small = a;
	        }
	        else
	        {
	           small = b;
	        }
			
	        System.out.print("Smallest of Two Number is " +small);
		
	
	}
}

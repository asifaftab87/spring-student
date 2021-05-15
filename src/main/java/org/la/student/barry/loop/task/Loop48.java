package org.la.student.barry.loop.task;

import java.util.Scanner;

public class Loop48 {
	
	// 	Wap to print all natural numbers from 1 to n.
	public static void main(String[] args) {
		
		
		//loop counter initialisation
				int i =1;

				//create object of scanner class
				Scanner Sc = new Scanner(System.in);

				// enter the value of " n "
				System.out.print("Enter the value n : ");

				// read the value.
				int n = Sc.nextInt();

				System.out.println("Numbers are : ");

				while(i<=n)
				{
					System.out.println(i);
					i++;
				}
		
     }
	

	}
  

	
	

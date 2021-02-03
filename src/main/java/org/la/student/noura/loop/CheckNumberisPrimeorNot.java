package org.la.student.noura.loop;

import java.util.Scanner;

public class CheckNumberisPrimeorNot {

	public static void main(String[] args) {
		//Wap to check whether a number is Prime number or not
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number: ");

		int num =sc.nextInt();
		int r = 2;
	    boolean flag = false;
	    while (r<num) {
	      // condition for non prime number
	      if (num%r == 0) {
	     
	        break;
	      }

	      ++r;
	    }

	    if (r==num)
	      System.out.println(num + " is a prime number.");
	    else
	      System.out.println(num + " is not a prime number.");
	}

}

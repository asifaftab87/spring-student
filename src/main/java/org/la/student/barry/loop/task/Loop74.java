package org.la.student.barry.loop.task;

import java.util.Scanner;

public class Loop74 {
	
	//Wap to check whether a number is Perfect number or not.
	public static void main(String[] args) {
		
		  int n, sum = 0;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter any integer you want to check:");
	        n = s.nextInt();
	        for(int i = 1; i < n; i++)
	        {
	            if(n % i == 0)
	            {
	                sum = sum + i;
	            }
	        }
	        if(sum == n)
	        {
	            System.out.println("Given number is Perfect");
	        }
	        else
	        {
	            System.out.println("Given number is not Perfect");
	        }    
	    }
	    int divisor(int x)
	    {
	       return x;
   }
}
	
  

	
	

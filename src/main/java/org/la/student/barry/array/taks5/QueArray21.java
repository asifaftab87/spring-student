package org.la.student.barry.array.taks5;

import java.util.Scanner;

public class QueArray21 {
//Write a java program to count occurrences of each element in an array
	  public static void main(String[] args) {  
		  int n, x, count = 0, i = 0;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter no. of elements you want in array:");
	        n = s.nextInt();
	        int a[] = new int[n];
	        System.out.println("Enter all the elements:");
	        for(i = 0; i < n; i++)
	        {
	            a[i] = s.nextInt();
	        }
	        System.out.print("Enter the element of which you want to count number of occurrences:");
	        x = s.nextInt();
	        for(i = 0; i < n; i++)
	        {
	            if(a[i] == x)
	            {
	                count++;
	            }
	        }
	        System.out.println("Number of Occurrence of the Element:"+count);
	}  
}
 
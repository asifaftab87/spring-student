package org.la.student.barry.array.taks5;

import java.util.Scanner;

public class QueArray23 {
// Write a Java program to calculate the average value of array elements
	  public static void main(String[] args) {  
		   int n, sum = 0;
	        float average;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter no. of elements you want in array:");
	        n = s.nextInt();
	        int a[] = new int[n];
	        System.out.println("Enter all the elements:");
	        for(int i = 0; i < n ; i++)
	        {
	            a[i] = s.nextInt();
	            sum = sum + a[i];
	        }
	        System.out.println("Sum:"+sum);
	        average = (float)sum / n;
	        System.out.println("Average:"+average);
	}  
}
 

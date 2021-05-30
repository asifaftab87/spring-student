package org.la.student.barry.array.taks5;

import java.util.Scanner;

public class QueArray37 {
	public static void main(String[] args) {	
		//wap to to divide each element of an array by 2.
	
     int n, sum1 = 0, sum2 = 0;
     Scanner s = new Scanner(System.in);
     System.out.print("Enter the number of elements in array:");
     n = s.nextInt();
     int[] a = new int[n];
     System.out.println("Enter the elements of the array:");
     for(int i = 0; i < n; i++)
     {
         a[i] = s.nextInt();
     }
     for(int i = 0; i < n; i++)
     {
         if(a[i] % 2 == 0)
         {
             sum1= sum1 + a[i];
         }
         else
         {
             sum2 = sum2 + a[i];
         }
     }
     System.out.println("Sum of Even Numbers:"+sum1);
     System.out.println("Sum of Odd Numbers:"+sum2);
 }
}

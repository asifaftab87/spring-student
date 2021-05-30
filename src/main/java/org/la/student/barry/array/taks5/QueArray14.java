package org.la.student.barry.array.taks5;

import java.util.Arrays;

public class QueArray14 {
// 14) wap to find greatest number from any array
         public static int getLargest(int[] a, int total){  
		   Arrays.sort(a);  
		   return a[total-1];  
		   }  
		   public static void main(String args[]){  
		   int a[]={1,2,8,6,3,2};  
		   int b[]={44,66,100,77,33,22,55};  
		   System.out.println("Largest: "+getLargest(a,6));  
		   System.out.println("Largest: "+getLargest(b,7));
		}  
	}
 

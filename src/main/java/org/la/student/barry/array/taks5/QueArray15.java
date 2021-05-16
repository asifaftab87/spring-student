package org.la.student.barry.array.taks5;

import java.util.Arrays;

public class QueArray15 {
// 15)  wap to find smallest number among array element
	public static int getSmallest(int[] a, int total){  
		Arrays.sort(a);  
		return a[0];  
		}  
		public static void main(String args[]){  
		int a[]={1,2,5,6,3,2};  
		//int b[]={44,66,99,77,33,22,55};  
		System.out.println("Smallest: "+getSmallest(a,6));  
		//System.out.println("Smallest: "+getSmallest(b,7));  
		}  
	}
 

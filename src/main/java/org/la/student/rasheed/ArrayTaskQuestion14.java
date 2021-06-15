package org.la.student.rasheed;
/*
 * wap to find greatest number from any array 
 */

public class ArrayTaskQuestion14 {

	public static void main(String[] args) {
		
		int arr [] = {1, 2, 350, 40, 50 ,3};
		int x, test =arr[0];
		for (int i=1; i<arr.length; i++)
		{
			x=arr[i];
			if (test<x) test =x;
		}
		System.out.println("greatest number is "+test);
		
		
		
		
		
		

	}

}


/*
 * Write a Java program to find the second largest element in an array?
 * 
 */

package org.la.student.rasheed;

import java.util.Arrays;

public class ArrayTaskQuestion32 {
	
	public static void main (String [] args) {
		
		int array [] = {10, 33, 100, 45, 77, 89, 99,  200};
		
		System.out.println("Orgignal numeric array : "+Arrays.toString(array));
		Arrays.sort(array);
		int x =array.length-1;
		while (array[x]==array[array.length-1]) {
			x--;
		}
		System.out.println("the second largest number is: "+array[x]);
	}

}

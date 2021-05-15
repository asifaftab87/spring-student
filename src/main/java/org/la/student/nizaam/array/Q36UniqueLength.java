package org.la.student.nizaam.array;

import java.util.Arrays;

public class Q36UniqueLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 	36) Write a Java program to remove the duplicate elements of a given array and return the new length of the array.Sample array: [20, 20, 30, 40, 50, 50, 50]
		After removing the duplicate elements the program should return 4 as the new length of the array?
		 */

		int a[]= {1,2,3,2,2,1,2,3,3,2,1};
		Arrays.sort(a);
		
		int index=0;
		for(int x=0;x<a.length;x++) {
			while(x<a.length-1 && a[x]==a[x+1])
				x++;
			
			index++;
		}
		System.out.println(index);
	}

}

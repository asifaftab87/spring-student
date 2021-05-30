package org.la.student.rasheed;
/*
 * Write a java program to find duplicate elements in an array? 
 */

public class ArrayTaskQuestion19 {

	public static void main(String[] args) {
		int [] arr = new int [] {90, 1, 90,2, 3, 10, 4, 2, 7, 8, 9, 10,};
		System.out.println("Duplicate elements in array");
		
		for (int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if (arr[i]==arr[j])
					System.out.println(arr[j]);
			}
		}
		

	}

}

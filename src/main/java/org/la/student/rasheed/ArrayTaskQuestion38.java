package org.la.student.rasheed;
/*
 * Find largest and smallest elements of an array? 
 */

public class ArrayTaskQuestion38 {

	public static void main(String[] args) {
		
		//array of 10 numbers
		
		int array [] = new int[] {7, 14, 45, 54, 2002, 23, 98, 89, 34, 50, 288, 999};
		//assign first element of an array to largest and smallest
		int smallest = array [0];
		int largest = array [0];
		
		for (int i =0; i<array.length; i++) {
			if(array [i] > largest)
				largest = array [i];
			else if (array [i] < smallest)
				smallest = array [i];
		}
		System.out.println("smallest number is :  "+smallest);
		System.out.println("largest  number is :  "+largest);

	}

}

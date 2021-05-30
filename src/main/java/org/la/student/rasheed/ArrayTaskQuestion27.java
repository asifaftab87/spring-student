package org.la.student.rasheed;
/*
 * Write a Java program to find the index of an array element(here u have to take any number and check that number is present inside an array or not,
 * 
 */

public class ArrayTaskQuestion27 {

	public static int findIndex (int[] my_array, int t) {
		if (my_array == null) return -1;
		int len = my_array.length;
		int i =0;
		while (1 < len) {
			if (my_array[i] ==t ) return i;
			else i=i+1;
			
			
		}
		return -1;
		

	}
	public static void main (String [] args) {
		int [] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		System.out.println("index position of 25 is: "+findIndex(my_array, 25));
		System.out.println("index position of 77 is: "+findIndex(my_array, 77));
	}

}

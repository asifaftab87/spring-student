package org.la.student.rasheed;
/*
 * Write a Java program to test if an array contains a specific value
 */

public class ArrayTaskQuestion26 {

	public static void main(String[] args) {
		
		int num[] = {1, 2, 3, 4, 5};
		int find=6;
		boolean found =false;
		
		for (int n : num) {
			if (n == find ) {
				found = true; 
				break;
			}
		}
		if (found)
			System.out.println(find + " is found. ");
		else 
			System.out.println(find + " is not found. ");

	}

}

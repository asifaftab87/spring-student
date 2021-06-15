package org.la.student.rasheed;
/*
 * Write a Java program to find the common elements between two arrays?
 */
      import java.util.Arrays;

public class ArrayTaskQuestion30 {

	public static void main(String[] args) {
		int [] array1 = {1, 2, 5, 5, 80, 44, 9, 70, 10};
		int [] array2 = {1, 0, 6, 44, 15, 6, 80, 4, 70, 0};
		
		System.out.println("Arrays1 : "+Arrays.toString(array1));
		System.out.println("Arrays2 : "+Arrays.toString(array2));
		
		
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				
			
			 if(array1[i] == (array2[j])){
				System.out.println("Common element is : "+(array1[i]));
				
			}
		}
		
		
		

		}
	}

}

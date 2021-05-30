package org.la.student.rasheed;
/*
 * Write a Java program to insert an element (specific position) into an array?
 */

    import java.util.Arrays;
public class ArrayTaskQuestion29 {

	public static void main(String[] args) {
		int [] arr = {25, 14, 56, 15, 36, 56, 77, 18, 29, 39, 49};
		// Insert an element in 3rd position of the array (index->2, value->5)
		
		int Index =2;
		int newValue =10;
		
		System.out.println("original Arry : "+Arrays.toString(arr));
		
		for (int i=arr.length-1; i>Index; i--) {
			arr[i] = arr[i-1];
			
		}
		arr[Index] = newValue;
		System.out.println("New Array: "+Arrays.toString(arr));

	}

}

package org.la.student.sadique.clas;

public class ReverseArrayPrint {

	public static void main(String[] args) {
		// wap to print array in reverse.

		int arr[] = new int[] { 1, 3, 5, 7, 9 };
		System.out.println("orignal array");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println(" ");
		System.out.println(" print reverse array");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i]);
		}

	}
 
}

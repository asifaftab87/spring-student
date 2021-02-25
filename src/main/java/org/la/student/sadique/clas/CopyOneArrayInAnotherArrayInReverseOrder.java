package org.la.student.sadique.clas;

public class CopyOneArrayInAnotherArrayInReverseOrder {

	public static void main(String[] args) {
		// wap to copy an array to another array in reverse order.
		int arr1[] = new int[] { 1, 5, 3, 8 };
		System.out.println("Original Array");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]);
		} System.out.println();
		System.out.println("Reverse Order");
		for (int i = arr1.length - 1; i >= 0; i--) {
			System.out.print(arr1[i]);

		}

	}

}

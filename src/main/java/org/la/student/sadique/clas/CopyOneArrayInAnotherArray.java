package org.la.student.sadique.clas;

public class CopyOneArrayInAnotherArray {

	public static void main(String[] args) {
		// wap to copy one array into other array
		int arr1[] = new int[] { 1, 3, 5 };
		int arr2[] = new int[arr1.length];
		System.out.println("Display first aray");
		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];

			System.out.println(arr1[i] + " ");
		}
		System.out.println("Cpoy in second aray ");
		for (int i = 0; i < arr2.length; i++) {
			
			System.out.println(arr2[i] + " ");
		}

	}

}

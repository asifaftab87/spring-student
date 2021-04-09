package org.la.student.sadique.clas;

public class RemoveSpecificElement {

	public static void main(String[] args) {
		// Write a Java program to remove a specific element from an array
		int arr[] = { 10, 20, 2, 30, 40, 50 };
		int del = 2;
		for (int i = 0; i < arr.length; i++) {
			if (del == arr[i]) {
				System.out.println(" ");
				for (int j = i; j <= arr.length; j++) {
					arr[j] = arr[j + 1];
					System.out.println(arr[j]);
				}
				//break;
			}
			System.out.println(arr[i]);
		}
		/*
		 * for (int k = 0; k < arr.length - 1; k++) { System.out.print(arr[k] + " "); }
		 */
	}

}

package org.la.student.sadique.clas;

public class PrintReverseArray {

	public static void main(String[] args) {
		// ) wap to print array in reverse order
		int x[] = new int[] { 1, 2, 5, 6 };
	
		System.out.println("Original form of Array");
		for (int y = 0; y < x.length; y++) {

			System.out.println(x[y] + " ");
		}
		System.out.println("Reverse Array in another array ");
		for (int y = x.length - 1; y >= 0; y--) {

			System.out.println(x[y] + " ");
		}

	}

}

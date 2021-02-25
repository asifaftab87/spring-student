package org.la.student.sadique.clas;

public class PrintReversArray {

	public static void main(String[] args) {
		// wap to reverse an array.

		int r[] = { 4, 2, 6, 41, 87 };

		System.out.println("Original array");

		for (int i = 0; i < r.length; i++) {

			System.out.println(r[i]);
		}

		System.out.println("Reverse array");

		for (int i = r.length - 1; i >= 0; i--) {

			System.out.println(r[i]);

		}

	}
}

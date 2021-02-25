package org.la.student.sadique.clas;

public class CopyTwoArrayInOneArray {

	public static void main(String[] args) {
		// wap to copy two arrays into one array.
		int a[] = { 1, 3, 5 };

		int b[] = { 7, 9, 11, 13 };

		int a_leng = a.length;

		int b_leng = b.length;

		int c_leng = a.length + b.length;

		int c[] = new int[c_leng];

		for (int i = 0; i < a_leng; i++) {
			c[i] = a[i];
		}
		for (int i = 0; i < b_leng; i++) {
			c[a_leng + i] = b[i];
		}
		for (int i = 0; i < c_leng; i++) {
			System.out.print(c[i] + " ");
		}
	}
}

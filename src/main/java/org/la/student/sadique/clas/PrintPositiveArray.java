package org.la.student.sadique.clas;

public class PrintPositiveArray {

	public static void main(String[] args) {
		// wap to print only positive number from an array.
		int a[] = { -1, -2, -4, -5,  -9, 10, 11, 12, 13 };
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0) {
				System.out.println(a[i] + " : positive  number");
			}

		}
	}
}

package org.la.student.sadique.clas;

public class CheekArrayNumberIsNotDivided {

	public static void main(String[] args) {
		// wap to print number not divisible by given number from an array.
		int a[] = { 10, 17, 25, 43, 63 };
		int n = a.length;
		// traverse for all elements
		for (int i = 0; i < n; i++) {

			int j;
			for (j = 0; j < n; j++)
				if (a[j] % a[i] >= 1)
					break;

			// it divides all
			if (j == n) {
				System.out.println(a[i] + "  divide the given number ");
			}
			System.out.println(a[i] + "  not divide the given number ");

		}

	}

}

package org.la.student.sadique.clas;

public class PrintAllPromeNumber {

	public static void main(String[] args) {
		// wap to print all prime numbers from an array ?
		int num[] = new int[] { 2, 4, 3, 5, 12, 8, 6, 25, 15 };
		System.out.println("Array elements  ");
		for (int a = 0; a < num.length; a++) {
			System.out.print(num[a] + " ");
		}
		System.out.println(" ");
		System.out.println("Prime number array element");
		for (int i = 0; i < num.length; i++) {
			int count = 0;
			for (int j = 2; j < num[i] - 1; j++) {
				if (num[i] % j == 0) {
					count = count + 1;
				}
			}
			if (count == 0) {
				System.out.print(num[i] + " ");
			}
		}

	}

}

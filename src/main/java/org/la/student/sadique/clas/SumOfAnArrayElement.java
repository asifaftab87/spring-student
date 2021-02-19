package org.la.student.sadique.clas;

public class SumOfAnArrayElement {

	public static void main(String[] args) {
		// wap to find some of an array element.
		int ae[] = { 2, 4, 6, 7, 7 };
		int sum = 0;
		System.out.print(" sum of an array element : ");
		for (int a = 0; a < ae.length; a++) {
			sum = sum + ae[a];

		}
		System.out.print(sum );

	}

}

package org.la.student.sadique.clas;

public class CheekNumberInsideIndexOrNot {

	public static void main(String[] args) {
		// 27) Write a Java program to find the index of an array element(here u have to
		// take any number and check that number is present inside an array or not,
		// if not print -1, if present then print its index means of of that element)?
		int red[] = new int[] { 2, 3, 4, 5, 6, 7, 8 };
		int q, s = 0, a = 6;
		int b = -1;
		int arr[] = new int[red.length];
		for (q = 0; q < red.length; q++) {
			if (a == red[q]) {
		System.out.println(red[q]+" is present in index");
			} else {
				System.out.println(b);
			}
		}
	}

}

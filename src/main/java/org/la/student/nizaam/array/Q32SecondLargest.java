package org.la.student.nizaam.array;

import java.util.Arrays;

public class Q32SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//	32) Write a Java program to find the second largest element in an array?
		int a[]= {12,25,2,6,98,24};
		Arrays.sort(a);
		System.out.println(a[a.length-2]);
	}

}

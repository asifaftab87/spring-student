package org.la.student.nizaam.array;

import java.util.Arrays;

public class Q38LargestSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {23,56,3,2,47,97,50};
		
		Arrays.sort(a);
		System.out.println("Largest number is "+a[a.length-1]);
		System.out.println("Smallest number is "+a[0]);
	}

}

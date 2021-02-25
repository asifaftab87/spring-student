package org.la.student.sadique.clas;

import java.util.*;

public class CountOccuranceOfElement {
	public static void main(String[] args) {
		// Write a java program to count occurrences of each element in an array.
		Scanner sc = new Scanner(System.in);

		System.out.println(" enter array size");
		int n = sc.nextInt();
		int a[] = new int[n];
		int b[] = new int[n];
		int c = 0;
		for (int i = 0; i < n; i++) {
			a[i]=sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			c = 1;
			if (a[i] != -1);{

			for (int j = i + 1; j < n; j++) {

				if (a[i] == a[j]) {
					c = c + 1;
					a[j] = -1;
				}
				
			}
			b[i] = c;
		}

	}
		for( int i=0;i<n;i++) {
			if(a[i]!=-1) {
				System.out.println(a[i]+ ":" + b[i]);
			}
		}

}
}

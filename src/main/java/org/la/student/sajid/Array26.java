package org.la.student.sajid;

public class Array26 {
	public static void main(String[] args) {
//		26) Write a Java program to test if an array contains a specific value?
		int a[]= {1,2,34,5,6,7,89,5};
		int specific=7;
		for(int i=0;i<a.length;i++) {
			if(specific==a[i]) {
				System.out.println("Yes: specific Number Is Available "+specific);
			}
		}
	}

}

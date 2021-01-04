package org.la.student.noura.array;

public class TestArrayContainsSpecificValue {

	public static void main(String[] args) {
		//Write a Java program to test if an array contains a specific value
		
		int a[]= {1,2,3,20};
		int specificValue=15;
		for(int i=0;i<a.length;i++) {
			
			System.out.print(" "+a[i]);
			if (a[i]==specificValue) {
				System.out.println();
				System.out.println("YES");
			}
		}
	}
}

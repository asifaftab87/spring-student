package org.la.student.sajid;

public class Array36 {
	public static void main(String[] args) {
//		36) Write a Java program to remove the duplicate elements of a given array and return the new length of the array.Sample array: [20, 20, 30, 40, 50, 50, 50]
		int a[]= {20, 20, 30, 40, 50, 50, 50};
		int j=0;
		for(int i=0;i<a.length-1;i++) {
		
			if(a[i]!=a[i+1]) {
				a[j]=a[i];
				j++;
			}
		}
		a[j]=a[a.length-1];
		for(int i=0;i<j;i++) {
			System.out.print(a[i]+" ");
		}
	}

}

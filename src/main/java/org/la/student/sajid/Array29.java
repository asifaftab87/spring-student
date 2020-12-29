package org.la.student.sajid;

public class Array29 {
	public static void main(String[] args) {
//		29) Write a Java program to insert an element (specific position) into an array?
		int a[]= {1,2,3,4,5,6,4,2,5,1,5,6,4,8,5,55,4,4,9};
		 int p=9;
		 int insert=100;
		for(int i=a.length-1;i<p-1;i--) {
			a[i]=a[i-1];
			
		}
		a[p-1]=insert;
		for(int i=0;i<a.length;i++) {
			System.out.println("Position "+(i+1)+": "+a[i]);
		}
	}

}

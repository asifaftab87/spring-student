package org.la.student.sajid;

public class Array31 {
	public static void main(String[] args) {
//		31) Write a Java program to remove duplicate elements from an array?
		int a[]= {1,1,2,2,3,4,4,4,5,6};
		int j=0;
		for(int i=0;i<a.length-1;i++) {
		
			if(a[i]!=a[i+1]) {
				a[j]=a[i];
				j++;
			}
		}
		a[j]=a[a.length-1];
		for(int i=0;i<j;i++) {
			System.out.print(a[i]);
		}
	}

}

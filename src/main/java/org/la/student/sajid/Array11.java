package org.la.student.sajid;

public class Array11 {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int []c=a;
		System.out.println("Orignal Array Number");
		for(int b=0;b<a.length;b++) {
		System.out.print(a[b]+" ");
		}
		System.out.println();
		System.out.println("Copy Array Number");
		for(int n=0;n<c.length;n++) {
			System.out.print(c[n]+" ");
		}
	}
}

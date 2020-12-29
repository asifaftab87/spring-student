package org.la.student.sajid;

public class Array24 {
	public static void main(String[] args) {
//		24) Write a java program to remove duplicate elements from an array?
		int a[]= {1,1,1,2,2,4,4,4,5,6};
		int j=0;
		for(int i=0;i<a.length-1;i++) {
			if(a[i]!=a[i+1]) {
				a[j]=a[i];
				j++;    
//				System.out.print(a[j]+" ");
			}
		}
		a[j]=a[a.length-1];
		for(int i=0;i<j+1;i++) {
			System.out.print(a[i]+" ");
		}
		
	}

}

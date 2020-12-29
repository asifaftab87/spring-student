package org.la.student.sajid;

public class Array30 {
	public static void main(String[] args) {
//		30) Write a Java program to find the common elements between two arrays?
		
		int a[]= {1,2,3,4,5,3};
		int b[]= {2,3,5,4,6};
		 for(int i=0;i<a.length;i++) {
			 for(int j=0;j<b.length;j++) {
				 if(a[i]==b[j]) {
					 System.out.print(a[i]+" ");
				 }
			 }
		 }
	}

}

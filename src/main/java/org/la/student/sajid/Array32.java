package org.la.student.sajid;

public class Array32 {
	public static void main(String[] args) {
//		32) Write a Java program to find the second largest element in an array?
		int temp ;
		int a[]= {1,2,3,4,5,6};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Second largest Number: "+a[a.length-2]);
		
	}

}

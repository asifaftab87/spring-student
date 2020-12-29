package org.la.student.sajid;

public class Array33 {
	public static void main(String[] args) {
//		33) Write a Java program to find the second smallest element in an array?
		
		int a[]= {10,2,3,4,5,6,7,8,1};
		int temp;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Second largest Number: "+a[0]);
		
	}

}

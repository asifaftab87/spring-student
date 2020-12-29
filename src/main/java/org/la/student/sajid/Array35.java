package org.la.student.sajid;

public class Array35 {
	public static void main(String[] args) {
//		35) Write a Java program to check if an array of integers without 0 and -1?
		int a[]= {-1,0,1,2,3,4,5,0,-1,};
		for(int i=0;i<a.length;i++) {
			if(a[i]!=0 && a[i]!=-1) {
				System.out.print(a[i]+" ");
			}
		}
	}

}

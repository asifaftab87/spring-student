package org.la.student.muhammad.abdullahi.methods;

import java.util.Arrays;

public class Q7sumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {2,3,1,6,4};
		sumArray(a);
	
}
	
	
	static void sumArray(int []a) {
		int n=1;
		for(int i=0;i<a.length;i++) {
			n +=a[i];
			
		}
		System.out.println(n);
	}
}
package org.la.student.muhammad.abdullahi.methods;

import java.util.Arrays;

public class Q6copyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,3,4,5};
		int b[]= new int[a.length];
		copyArray(a,b);
		
	
}
	
	
	static void copyArray(int[]a,int[] b) {
		
	for(int i=0;i<a.length;i++) {
		b[i]=a[i];
	}
		System.out.println(Arrays.toString(b) );

		
	}
}

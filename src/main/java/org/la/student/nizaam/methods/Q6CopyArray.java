package org.la.student.nizaam.methods;

import java.util.Arrays;

public class Q6CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {-1,-2,0,1,2,-3};
		int b[] = new int[arr.length];
		copy(arr,b);
		
	}
	
	static void copy(int[] a, int[] b) {
		System.out.println("Copying array");
		for(int i=0;i<a.length;i++) {
			b[i]=a[i];
		}
		System.out.println(Arrays.toString(b));
	}

}

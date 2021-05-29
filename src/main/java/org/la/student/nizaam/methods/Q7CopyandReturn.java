package org.la.student.nizaam.methods;

import java.util.Arrays;

public class Q7CopyandReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {-1,-2,0,1,2,-3};
		int b[] = copy(arr);
		System.out.println(Arrays.toString(b));
		
	}
	
	static int[] copy(int[] a) {
		int b[] = new int[a.length];
		System.out.println("Copying array");
		for(int i=0;i<a.length;i++) {
			b[i]=a[i];
		}
		return b;
	}

}

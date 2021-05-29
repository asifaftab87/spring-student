package org.la.student.nizaam.methods;

import java.util.Arrays;

public class Q13Copy2Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {1,2,3,4,5,6};
		int arr1[] = {6,5,4,3,2,1};
		int res[] = copyofArrays(arr,arr1);
		System.out.println(Arrays.toString(res));
		
	}
	
	static int[] copyofArrays(int[] a,int[] b) {
		int res[]=new int[a.length+b.length];
		int i=0;
		for(;i<a.length;i++) {
			res[i]=a[i];
		}
		for(int j=0;j<b.length;j++,i++) {
			res[i]=b[j];
		}
		return res;
	}

}

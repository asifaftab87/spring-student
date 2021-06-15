package org.la.student.nizaam.methods;

import java.util.Arrays;

public class Q12Sumof2Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {1,2,3,4,5,6};
		int arr1[] = {6,5,4,3,2,1};
		int res[] = SumofArray(arr,arr1);
		System.out.println(Arrays.toString(res));
		
	}
	
	static int[] SumofArray(int[] a,int[] b) {
		int res[]=new int[a.length];

		for(int i=0;i<a.length;i++) {
			res[i]=a[i]+b[i];
		}
		return res;
	}

}

package org.la.student.nizaam.methods;

import java.util.Arrays;

public class Q8SumofElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int arr[]= {-1,-2,5,1,2,-3};
		int b = sum(arr);
		System.out.println(b);
		
	}
	
	static int sum(int[] a) {
		int sum=0;
		System.out.println("calculate sum of elements");
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		return sum;
	}

}

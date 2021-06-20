package org.la.student.muhammad.abdullahi.array;

import java.util.Arrays;

class array18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


			
		
		
		int arr[]= {1,2,3,4,5}, a1[]= {1,2,3,4,5};
		int[] a2 =new int[arr.length]; 
		
		for(int i=0;i<arr.length;i++) {
			a2[i]=arr[i]+a1[i];
		}
		System.out.println(Arrays.toString(a2));
	
	}
}

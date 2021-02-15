package org.la.student.noura.clas;

public class Array {
	public static void merge(int arr1[] , int arr2[] ) {
		
		int s1=arr1.length;
		int s2=arr2.length;
		int []c=new int[s1+s2];
		
		
		for (int i=0;i<s1;i++) {
			c[i]=arr1[i];
		}
		for(int i=0;i<s2;i++) {
			c[s1+i]=arr2[i];
		}

		for(int i=0;i<c.length;i++){
		System.out.println(c[i]);
}
	}
}
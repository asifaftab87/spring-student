package org.la.student.tahir.array;


public class Copytwoarraysintoonearray {

	public static void main(String[] args) {
		// wap to add two array elements n copy into third array
		
		int[] a = {6,4,566,4};
		int[] b = { 8, 9,4, 3};
		int arr1= a.length;
		int arr2= b.length;
		
		int[] c = new int[arr1 + arr2];
		int i=0;
		for(; i<a.length; i++) {
			
			c[i] = a[i] ;
			
		//System.out.println(c[i]);
		}
		
		for(int j=1; j<b.length; j++) {
			
			c[i]= b[j];
			
		//	System.out.println(c[i]);
			i++;
		}
		
		for(int x=0; x<c.length-1; x++) {
		
			System.out.println(c[x]);
		}
		
		
		
		
	}

}

package org.la.student.tahir.array;
import java.util.Arrays;

public class Copytwoarraysintoonearray {

	public static void main(String[] args) {
		// wap to add two array elements n copy into third array
		
		int[] a = {6,4,566,4};
		int[] b = { 8, 9,4, 3};
		int arr1= a.length;
		int arr2= b.length;
		
		int[] c = new int[arr1 + arr2];
		
		for(int i=0; i<a.length; i++) {
			
			c[i] = a[i] + b[i];
			
			System.out.println(c[i]);
		}
		
		
		
		
	}

}

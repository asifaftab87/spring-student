package org.la.student.tahir.array;

public class sumofanarrayelement {

	public static void main(String[] args) {
		//wap to find sum of an array element
		
		int[] a = {2,3,4,10};
		int sum= 0;
		for(int i=0; i<a.length; i++) {
			
			sum = sum+ a[i];
		}
		
		System.out.println("Sum = "+ sum);
		
}}


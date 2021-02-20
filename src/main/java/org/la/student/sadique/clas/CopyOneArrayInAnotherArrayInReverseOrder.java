package org.la.student.sadique.clas;

public class CopyOneArrayInAnotherArrayInReverseOrder {

	public static void main(String[] args) {
		// wap to copy an array to another array in reverse order.
		int arr1[]=new int [] {1,5,3,8};
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
		System.out.println("reverse order");
		for(int i=arr1.length-1;i>=0;i--) {
			System.out.println(arr1[i]);
		}
		int arr2[]=new int [arr1.length];
		for(int j=0;j<arr2.length;j++) {
			System.out.println(arr2[j]);
		}
		

	}

}

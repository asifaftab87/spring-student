package org.la.student.sadique.clas;

public class RemoveDublicateArray {

	public static void main(String[] args) {
		// Write a java program to remove duplicate elements from an array.
		int arr[]= {1,1,2,3,3,4,4,4,5,5,5,5};
		int len=arr.length;
		int j=0;
		int tmp[]= new int[arr.length];
		for(int a=0;a<len-1;a++) {
			if(arr[a]!=arr[a+1]) {
				tmp[j++]=arr[a];
			}
		}
		tmp[j++]=arr[len-1];
		for(int i=0;i<j;i++) {
			System.out.print(tmp[i]+" ");
		}

	}

}

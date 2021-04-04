package org.la.student.sadique.clas;

public class InsertSpecificValueInIndex {
	public static void main(String[] args) {
		
		//Write a Java program to insert an element (specific position) into an array.
		int arr[]= {10,20,30,50,60,70};
		int pos=4;
		int num=40;
		for(int i=arr.length-1;i>pos-1;i--){
			arr[i]=arr[i-1];
		}
		arr[pos-1]=num;
		
		for(int j=0;j<arr.length;j++) {
			System.out.println(arr[j]+ " ");
		}
	}

}

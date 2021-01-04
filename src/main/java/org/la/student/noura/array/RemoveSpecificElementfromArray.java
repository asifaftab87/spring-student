package org.la.student.noura.array;

public class RemoveSpecificElementfromArray {

	public static void main(String[] args) {
		//Write a Java program to remove a specific element from an array
		
		int arr[]= {20,30,40,60,100};
		int s=100;//specific element to be removed
		int len=arr.length;
		for(int i=0;i<len;i++) {
			
			if (arr[i]!=s) {
				arr[i]=arr[i];
				System.out.print(" "+arr[i]);
			    }
	     	}
	
	}
}


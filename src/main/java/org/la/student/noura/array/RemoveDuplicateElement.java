package org.la.student.noura.array;


public class RemoveDuplicateElement {

	public static void main(String[] args) {
		//Write a java program to remove duplicate elements from an array
		
	
		       
int arr[]= {1,1,2,2,4,3,5,6,6};
		
		int len=arr.length;
		int j=0;
		
		for(int i=0;i<len-1;i++) {
			if(arr[i]!=arr[i+1]) {
				arr[j++]=arr[i];
				
			}
			
		}
		
		arr[j++]=arr[len-1];
		for(int k=0;k<j;k++) {
			System.out.print(arr[k]+" ");
		}
		
		
	}	

	

}

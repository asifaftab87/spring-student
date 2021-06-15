package org.la.student.muhammad.abdullahi.array;

import java.util.Arrays;

class array19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


			
		
		
		int arr[]= {1,2,3,8,7,2,6,7,8}; 
		
		
		
		for(int i=0;i<arr.length;i++) {
		for(int x=i+1;x<arr.length;x++) {
			if(arr[i]==arr[x]) { 
				
				System.out.println(arr[x]);
				break;
			}
			
		}	
			
		}
		System.out.println("----end----");
	
	}
}

package org.la.student.noura.array;

public class FindCommonElementsbetween2arrays {

	public static void main(String[] args) {
		//Write a Java program to find the common elements between two arrays
		
		int a[]= {1,2,3,4};
		int b []= {2,4,5,7};
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=0;j<b.length;j++) {
				
				
				if(a[i]==b[j]) {
					System.out.println(a[i]);
				}
			}
			
			
		}
		

	}

}

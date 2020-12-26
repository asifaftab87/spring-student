package org.la.student.tahir.array;

public class Findduplicateelementinanarray {

	public static void main(String[] args) {
		// Write a java program to find duplicate elements in an array
		
		int[] a= {2,4,3,3,6,2};
		
		for(int i=0; i<a.length-1; i++) {
			
			for(int j=i+1; j<a.length; j++) {
				
				if(a[i]==a[j]&&(i != j)) {
					System.out.println("Duplicate :" + a[j]);
				}
				
			}
			
				
		}
	}
}
		
	





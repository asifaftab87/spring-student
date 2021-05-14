package org.la.student.barry.array;

public class ShareMemory {

	public static void main(String[] args) {
	
		int a[]= {1, -1};
		int b[]= a;
		
		for(int i : a) { 
			System.out.println(i);
		}
        for(int i : b) {
        	System.out.println(i);
        }  
         b[1]=100;
         for(int i : a ) {
        	 System.out.println(i);
         }
	}
}

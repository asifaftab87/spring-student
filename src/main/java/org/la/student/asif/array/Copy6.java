package org.la.student.asif.array;

public class Copy6 {

	public static void main(String[] args) {
		
		int[] a = {220, 2100, 330, 100};	
		
		int g = a[0];
		for(int i=1 ; i<a.length ; i++) {
			if(g<a[i]) {
				g = a[i];
			}
		}
		
		System.out.println("greatest: "+g);
		
	}
}

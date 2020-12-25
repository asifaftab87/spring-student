package org.la.student.sajid;

public class Array12 {
	public static void main(String[] args) {
//		12) wap to copy an array to another array in reverse order
		int s[]= {8,5,2,3,6,9};
		int[] c= new int[s.length];
		
		for(int d=0;d<s.length;d++) {
			c[d]=s[s.length-1-d];
			System.out.print(" "+c[d]);
		}
		
	}
}
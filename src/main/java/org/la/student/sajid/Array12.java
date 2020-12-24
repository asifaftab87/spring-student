package org.la.student.sajid;

public class Array12 {
	public static void main(String[] args) {
//		12) wap to copy an array to another array in reverse order
		int source[]= {8,5,2,3,6,9};
		int[] copy= new int[source.length];

		for (int i=0;i<copy.length;i++) {
			copy[i]=source[source.length-1];
			System.out.print(" "+copy[i]);
		}
		
	}

}


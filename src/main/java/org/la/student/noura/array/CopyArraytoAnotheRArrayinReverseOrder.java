package org.la.student.noura.array;

public class CopyArraytoAnotheRArrayinReverseOrder {

	public static void main(String[] args) {
		//wap to copy an array to another array in reverse order
		
		int source[]= {1,2,3,4,5,6,7,8,9};
		int[] copy= new int[source.length];
		for (int i=0;i<source.length;i++) {
			System.out.print("  "+source[i]);}
		
		System.out.println();
		for (int i=0;i<copy.length;i++) {
			copy[i]=source[source.length-1-i];
			System.out.print("  "+copy[i]);
		}
		
		

	}

}

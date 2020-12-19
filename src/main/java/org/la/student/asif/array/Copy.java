package org.la.student.asif.array;

public class Copy {

	public static void main(String[] args) {
		
		int[] a = {22, 12, 0, 1};
		int[] b = a;
		
		System.out.print("b: ");
		for(int i=0; i<b.length ; i++) {
			System.out.print(b[i]+" ");
		}
		
		b[0] = -1;
		System.out.println("");
		
		System.out.print("a: ");
		for(int i=0; i<b.length ; i++) {
			System.out.print(a[i]+" ");
		}
		
		if(a==b) {
			System.out.println("\nsame address");
		}
		else {
			System.out.println("\ndifferent address");
		}
	}
}

package org.la.student.asif.array;

public class ArrayOperation {

	public int[] copy(int[] src) {
		int[] t = new int[src.length];
		for(int i=0 ; i<t.length ; i++) {
			t[i] = src[i];
		}
		return t;
	}
	
	public void print(int a[]) {
		for(int i : a) {
			System.out.print(i+" ");
		}
	}
}

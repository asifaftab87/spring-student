package org.la.student.noor.inherit;

public class FinalArray {
	public static void main(String[] args) {

		final int[] a = {1, 2, 3};
		a[0] = 6;
		//	a = new int[] { 4, 5};	reference cannot change bcz it is constant
		//but element values can change
	}
}

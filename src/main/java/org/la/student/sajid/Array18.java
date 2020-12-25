package org.la.student.sajid;

public class Array18 {
	public static void main(String[] args) {
//		18) wap to add two array elements n copy into third array

		int[] a = {1, 2, 3};
		int[] b = {1, 2, 3};

		int[] c = new int[a.length];
		for (int i = 0; i < a.length; ++i) {
		  c[i] = a[i] + b[i];
		  System.out.println(c[i]);
		}
	}

}

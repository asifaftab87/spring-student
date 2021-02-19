package org.la.student.sadique.clas;

public class PrintArryUsingLoop {
	public static void main(String[] args) {
		// 02) wap to create and print array using loop.
		int z[] = new int[3];
		z[0] = 23;
		z[1] = 43;
		z[2] = 12;
		for (int i = 0; i < z.length; i++)
			System.out.println(z[i]);
		System.out.println( "length of array "+ z.length);
	}

}

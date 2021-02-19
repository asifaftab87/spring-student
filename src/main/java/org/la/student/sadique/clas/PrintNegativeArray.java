package org.la.student.sadique.clas;

public class PrintNegativeArray {
	//07) wap to print only negative number from an array.
	public static void main(String[] args) {
		int dx[] = { 1, 2, -3, 23, -29, 21 };
		for (int d = 1; d < dx.length; d++) {
			if (dx[d] < 0) {
				System.out.println(dx[d] + " is negative number");
			}
		}
	}

}

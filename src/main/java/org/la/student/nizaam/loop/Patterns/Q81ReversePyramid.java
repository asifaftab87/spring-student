package org.la.student.nizaam.loop.Patterns;

public class Q81ReversePyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i, j, k;

        for (i = 6; i > 0; i--) {
            for (j = 6; j > i; j--) {
                System.out.print(" ");
            }
            for (k = 0; k < (i * 2 - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

	}

}

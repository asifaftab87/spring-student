package org.la.student.asif.operators;

/*
 * wap to find number is negative or positive?
 */

public class Ternary6 {

	public static void main(String[] args) {
		
		int x = 12, y = 5, z = 91;
		
		int r = (x>y)?(x>z?x:z):(y>z?y:z);
		
		System.out.println("r: "+r);
	}
}

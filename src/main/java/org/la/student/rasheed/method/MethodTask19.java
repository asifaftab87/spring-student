package org.la.student.rasheed.method;
/*
 * double average(int, int, int) - find average of formal arguments and return result
 */

public class MethodTask19 {

	public static void main(String[] args) {
		
		
		int x=2,y=6, z=8;
		System.out.println(average( x, y, z));
	}

	static int average(int x, int y, int z) {
		return (x+y+z)/2;
	}

}

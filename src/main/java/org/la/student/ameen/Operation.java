package org.la.student.ameen;

public class Operation {

	public static void main(String[] args) {
		int x = 20 , y = 10 ;
		double z = x + y + 7 + y-- + x ;
		double d = (x + y ) * 7 + (--y + x );
		System.out.println(z);
		System.out.println(d);
	}

}

package org.la.student.tania;

public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		int y = -2;
		int z = ++x * y++;
		System.out.println(x);
		System.out.println( y );
	    System.out.println(z);

		 int a= 3;
		int b = 2;
		int c = x++ * y++;
		System.out.println(a);
		System.out.println( b );
		System.out.println(c);

		int e = -1;
		int f = 2;
		int g = --x * y++;
		System.out.println(e);
		System.out.println( f );
		System.out.println(g);

	}

}

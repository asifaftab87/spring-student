package org.la.student.jamal.operators;

public class RelationalOperator15 {
	
	/*
	 * 13. int y = -1;
		int x = 5 * y++ ;
		sop(x);
		sop(y);

	 */

	public static void main(String[] args) {
		
		int a=1, b=2, c=-3;
		int s = ++a + b-- + c%3 ;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(s);


	}

}
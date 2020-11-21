package org.la.student.sadique;

public class RelationalOperator11 {
	public static void main(String[] args) {
		int c= 0, d= 50, e=50;
		boolean b = (c == 1) && (++e<100);
		System.out.println(b);
		System.out.println("e="+e);
		boolean f = (++e<100) && (c==1);
		System.out.println("e="+e);
	}

}

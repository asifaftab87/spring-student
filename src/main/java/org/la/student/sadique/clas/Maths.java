package org.la.student.sadique.clas;

public class Maths {
	public static void main(String[] args) {
		int a=prod();
		System.out.println("product of two numbefr is "+a);
		int r=sum(3,4);
		System.out.println("sum of two number is "+r);
		sub(6,3);
	}
	static int sum(int x, int y) {
		return x+y;
	}
	static void sub(int x, int y) {
		System.out.println("subtract : "+(x-y));
	}
	static int prod() {
		int i=3, j=4;
		int prod=i*j;
		return prod;
	}

}

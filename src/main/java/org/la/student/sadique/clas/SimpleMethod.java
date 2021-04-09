package org.la.student.sadique.clas;

public class SimpleMethod {
	static char fun1() {
		char y = 'A';
		return y;
	}

	public static void main(String[] args) {
		fun();
		char d = fun1();
		System.out.println("Not accepet but return the value : " + d);

		fun2(98);
		boolean b = fun3(2);
		System.out.println("Accepet but Return : " + b);

	}

	static void fun() {
		System.out.println("Neither return nor accepet :  only display ");
	}

	static void fun2(int a) {
		System.out.println("Accepet but not Return : " + a);
	}

	static boolean fun3(int j) {
		return j == 2;
	}

}

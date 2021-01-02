package org.la.student.asif.method;

public class MethodFromMethod {

	public static void main(String[] args) {

		System.out.println("main start");
		fun1();
		System.out.println("main before fun2 but after fun1");
		fun2();
		System.out.println("main end");
	}

	static void fun1() {
		System.out.println("start fun1");
		fun2();
		System.out.println("end fun1");
	}

	static void fun2() {

		System.out.println("start fun2");

		System.out.println("end fun2");
	}

}

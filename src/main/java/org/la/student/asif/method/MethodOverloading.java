package org.la.student.asif.method;

public class MethodOverloading {

	public static void main(String[] args) {
		display("java learning");
		display();
		display(false, 33);
		display(1, true);
		display(4);
	}

	static void display() {
		System.out.println("no arguments");
	}
	static void display(int i) {
		System.out.println("one argument "+i);
	}
	static void display(int i, boolean b) {
		System.out.println("boolean and int arguments "+b+"   "+i);
	}
	static void display(boolean b, int i) {
		System.out.println("boolean and int arguments "+b+"   "+i);
	}
	static void display(String s) {
		System.out.println("string argument: "+s);
	}
}

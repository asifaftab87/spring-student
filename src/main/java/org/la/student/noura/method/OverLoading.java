package org.la.student.noura.method;

public class OverLoading {

	public static void main(String[] args) {
		print(5 , 1.0);
		print(2 , false);
		print(77);
		print("I am Noura");


	}

	static void print(String f) {
		System.out.println("this is string argument "+f);
	}
	static void print(int b,boolean f) {
		System.out.println(b+" "+f);
	}
	static void print(int x) {
		System.out.println("one aregument "+x);
	}
	static void print(int i,double s) {
		System.out.println(i+" "+s);
	}
}

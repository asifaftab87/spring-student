package org.la.student.asif.intrfc;

public class ExampleOneImplMain {

	public static void main(String[] args) {
		
		ExampleOne exampleOne = new ExampleOneImpl();
		exampleOne.fun();
		System.out.println(exampleOne.sum());
		ExampleOne.print();
	}
}

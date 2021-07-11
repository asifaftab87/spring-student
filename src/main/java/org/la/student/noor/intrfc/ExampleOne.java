package org.la.student.noor.intrfc;

public interface ExampleOne {
	public void fun();

	default int sum() {
		return 1 + 2;
	}

	static void print() {
		System.out.println("print");
	}
}

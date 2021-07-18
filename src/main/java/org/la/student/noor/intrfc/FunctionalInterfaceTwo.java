package org.la.student.noor.intrfc;

@FunctionalInterface
public interface FunctionalInterfaceTwo {

	public void sub();

	default void print() {
		System.out.println("default print method");
	}


}

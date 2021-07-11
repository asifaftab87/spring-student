package org.la.student.asif.intrfc;

@FunctionalInterface
public interface FunctionalInterfaceThree {

	public void mult();
	
	default void print() {
		System.out.println("default print method");
	}
	
	static void display() {
		System.out.println("display static method");
	}
}

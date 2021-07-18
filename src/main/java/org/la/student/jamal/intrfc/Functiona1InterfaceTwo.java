package org.la.student.jamal.intrfc;

@FunctionalInterface
public interface Functiona1InterfaceTwo {
	
	public void sub();
	
	
	default void print() {
		System.out.println("default print method");
	}

}

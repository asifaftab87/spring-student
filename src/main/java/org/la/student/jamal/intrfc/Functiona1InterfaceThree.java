package org.la.student.jamal.intrfc;

@FunctionalInterface
public interface Functiona1InterfaceThree {
	

	public void mult();
	
	
	default void print() {
		System.out.println("default print method");
		
	}
	static void display() {
		System.out.println(" display static method");
	}

}

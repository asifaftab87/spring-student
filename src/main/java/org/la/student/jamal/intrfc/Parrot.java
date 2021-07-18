package org.la.student.jamal.intrfc;

public interface Parrot {
	
	default void fly() {
		System.out.println(" Parrot can fly ");
	}
	

}

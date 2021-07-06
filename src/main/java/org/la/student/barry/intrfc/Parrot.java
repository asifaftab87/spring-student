package org.la.student.barry.intrfc;

public interface Parrot {
	default void fly() {
		System.out.println("Parrot can fly");
	}

}

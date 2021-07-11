package org.la.student.noor.intrfc;

public interface Parrot {
	default void fly() {
		System.out.println("Pigeon can fly");
	}
}

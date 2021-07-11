package org.la.student.noor.intrfc;

public interface Pigeon {
	default void fly() {
		System.out.println("Pigeon can fly");
	}
}

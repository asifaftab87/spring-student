package org.la.student.asif.intrfc;

public interface Pigeon {

	default void fly() {
		System.out.println("Pigeon can fly");
	}
}

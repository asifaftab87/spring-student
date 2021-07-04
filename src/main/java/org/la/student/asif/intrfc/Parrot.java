package org.la.student.asif.intrfc;

public interface Parrot {

	default void fly() {
		System.out.println("parrot can fly");
	}
}

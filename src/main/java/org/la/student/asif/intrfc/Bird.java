package org.la.student.asif.intrfc;

public class Bird implements Parrot, Pigeon{

	@Override
	public void fly() {
		System.out.println("bird can fly");
	}

}

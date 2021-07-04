package org.la.student.asif.intrfc;

public class Vehicle implements Car, Train{

	@Override
	public void rail() {
		System.out.println("on track");
	}

	@Override
	public void run() {
		System.out.println("on road");
	}

}

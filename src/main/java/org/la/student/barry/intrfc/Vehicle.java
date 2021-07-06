package org.la.student.barry.intrfc;

public class Vehicle implements Car, Train{

	@Override
	public void rail() {
		System.out.println("ON track");
		
	}

	@Override
	public void run() {
		System.out.println("ont road");
		
	}

}

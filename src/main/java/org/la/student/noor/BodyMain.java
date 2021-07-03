package org.la.student.noor;

public class BodyMain {
	public static void main(String[] args) {

		Body.roll = 5;
		Body.staticMethod();

		Body body = new Body();
		body.instance();
		body.id = 60;
		body.staticMethod();
		body.roll = 56;
	}
}

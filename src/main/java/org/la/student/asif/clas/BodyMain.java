package org.la.student.asif.clas;

public class BodyMain {

	public static void main(String[] args) {
		
		Body.roll = 3;
		Body.staticMethod();
		
		Body body = new Body();
		body.instance();
		body.id = 99;
		body.staticMethod();
		body.roll = 66;
	}
}

package org.la.student.asif.inherit.impl;

import org.la.student.asif.inherit.DefaultAccessExample;

public class DefaultAccessExampleMain {

	public static void main(String[] args) {
		
		DefaultAccessExample accessExample = new DefaultAccessExample();
		//accessExample.dfault();	default members of a class cannot be access outside the package
									//this is difference between protected and default access specifier
		//accessExample.protc();
	}
}

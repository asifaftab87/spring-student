package org.la.student.asif.inherit.impl;

import org.la.student.asif.inherit.DefaultAccessExample;

public class DefaultAccessExampleChild extends DefaultAccessExample{
	
	public static void main(String[] args) {
		DefaultAccessExampleChild accessExampleChild = new DefaultAccessExampleChild();
		accessExampleChild.method();
		DefaultAccessExample accessExample = new DefaultAccessExample();
		//accessExample.dfault();		default members of a class cannot be access outside the package
										//this is difference between protected and default access specifier
	}
	
	void method() {
		protc();
		//dfault();
	}

}

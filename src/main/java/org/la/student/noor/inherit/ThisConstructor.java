package org.la.student.noor.inherit;

public class ThisConstructor {
	public ThisConstructor() {
		this(2);
		System.out.println("default constructor");
	}
	public ThisConstructor(int id) {
		System.out.println("parameterized int constructor: "+id);
	}
	public ThisConstructor(String s) {
		this();
		System.out.println("parameterized String constructor : "+s);
	}

	public void dd() {
		//this(2);	//not allowed, can use from constructor n first line and once only
	}
}

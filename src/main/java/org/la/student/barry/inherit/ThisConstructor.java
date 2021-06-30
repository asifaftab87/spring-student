package org.la.student.barry.inherit;

public class ThisConstructor {
	
	public ThisConstructor() {
		this(2);
		System.out.println("default constructor:");
		
	}

	public ThisConstructor(int id) {
		System.out.println("parametized int constructor:" + id);
	}
	
	public ThisConstructor(String s) {
		this();
		System.out.println("Parametized String  constructor:" + s);
	}
}

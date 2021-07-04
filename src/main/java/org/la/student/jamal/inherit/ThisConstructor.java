package org.la.student.jamal.inherit;

public class ThisConstructor {
	
	public ThisConstructor() {
		this(3);
		System.out.println("default Constructor");
	}
	
	public ThisConstructor(int id) {
	
		System.out.println("parameterized int Constructor :"+id);
	}
	
	public ThisConstructor(String s) {
		this();
		System.out.println("parameterized String Constructor :"+s);
	}

}

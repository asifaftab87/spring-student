package org.la.student.asif.inherit;

public class A {

	private int priv;
	int def;
	public int pub;
	protected int prot;
	
	public void publ() {
		System.out.println("A this is public method");
	}
	
	void deflt() {
		System.out.println("A this is default method");
	}
	
	private void privt() {
		System.out.println("A this is private method");
	}
	
	protected void protect() {
		System.out.println("A this is protected method");
	}
}

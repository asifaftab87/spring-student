package org.la.student.noura.inherit;

public class A {
	
	private int priv;
	int def;
	public int pub;
	protected int prot;
	

	public void publ() {
		System.out.println("this is public method");
	}
	
	void deflt() {
		System.out.println("this is default method");
	}
	private void priv() {
		System.out.println("this is private method");}
	
	protected void protect() {
		System.out.println("this is protected method");}
	
}

package org.la.student.tahir.inheritance;

public class ClassA {

	private int id;
	String name;
	public String pub;
	protected double grade;
	
	public void pub() {
		
		System.out.println("This is a public method of A");
	}
	
	private void priv() {
		System.out.println("This is a private method");
	}
	
	void deflt() {
		System.out.println("This is a default method of A");
	}
	
	protected void protecte() {
		System.out.println("This is a protected method of A");
	}
	
}

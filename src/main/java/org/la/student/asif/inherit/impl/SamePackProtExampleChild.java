package org.la.student.asif.inherit.impl;

import org.la.student.asif.inherit.ProtectedExample;

public class SamePackProtExampleChild extends ProtectedExample{

	public static void main(String[] a) {
		SamePackProtExampleChild child = new SamePackProtExampleChild();
		child.example();
	}
	
	public void example() {
		System.out.println("id: "+id);
		print();
	}
}

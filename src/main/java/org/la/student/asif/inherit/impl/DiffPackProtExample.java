package org.la.student.asif.inherit.impl;

import org.la.student.asif.inherit.ProtectedExample;

public class DiffPackProtExample {

	public static void main(String[] a) {
		ProtectedExample example = new ProtectedExample();
		//System.out.println("id: "+example.id);	//not accessible from different package class
		//example.print();							//not accessible from different package class
	}
}

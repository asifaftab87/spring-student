package org.la.student.barry.inherit.impl;

import org.la.student.barry.inherit.ProtectedExample;

public class DiffPackExample {
	
	public static void main(String[] a) {
		
		ProtectedExample example = new ProtectedExample();
		//System.out.println("Id: "+example.id); // not accessible from different package class
		// example.print();   // not accessible from different package class
	}

}

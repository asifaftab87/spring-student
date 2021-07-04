package org.la.student.asif.inherit;

public class SamePackProtExample {

	public static void main(String[] a) {
		ProtectedExample example = new ProtectedExample();
		System.out.println("id: "+example.id);
		example.print();
	}
}

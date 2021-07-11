package org.la.student.noor.inherit.impl;

import org.la.student.noor.inherit.ProtectedExample;

public class SamePackProtExampleChild extends ProtectedExample {
	

		public static void main(String[] a) {
			SamePackProtExampleChild child = new SamePackProtExampleChild();
			child.example();
		}

		public void example() {
			System.out.println("id: "+id);
			print();
		}
}

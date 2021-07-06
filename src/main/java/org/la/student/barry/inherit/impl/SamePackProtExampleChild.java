package org.la.student.barry.inherit.impl;

import org.la.student.barry.inherit.ProtectedExample;
// import org.la.student.barry.inherit.SamePackProtExample;

public class SamePackProtExampleChild  extends ProtectedExample {
	
	
		public static void main(String[] a) {
			
			SamePackProtExampleChild child = new SamePackProtExampleChild();
			child.example();
		}
		
		public void example() {
			System.out.println("Id: "+id);
			print();
		
	}
	

}

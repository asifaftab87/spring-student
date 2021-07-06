package org.la.student.barry.inherit;

public class SamePackProtExample {
	
	public static void main(String[] a) {
		
		ProtectedExample example = new ProtectedExample();
		System.out.println("Id: "+example.id);
		example.print();
	}

}

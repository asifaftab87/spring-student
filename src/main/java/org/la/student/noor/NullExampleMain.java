package org.la.student.noor;

public class NullExampleMain {
	public static void main(String[] args) {

		NullExample ne = null;//new NullExample();
		if(ne!=null) {
			System.out.println("String object :"+ne.getName());
			System.out.println("char primitive :"+ne.getC());
			System.out.println("int primitive :"+ne.getId());
			System.out.println("double primitive :"+ne.getD());
		}
		else {
			System.out.println("object is null");
		}
	}
}

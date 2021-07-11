package org.la.student.asif.clas;

public class InnerClassOne {

	public void func() {
		InnerClass innerClass = new InnerClass();
		innerClass.hello();
	}
	
	class InnerClass {
		public void hello() {
			System.out.println("Hello world");
		}
		void print() {
			System.out.println("default method");
		}
	}
	
}

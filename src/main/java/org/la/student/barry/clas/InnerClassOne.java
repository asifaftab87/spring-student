package org.la.student.barry.clas;

public class InnerClassOne {
	public void  fun() {
		InnerClass innerClass = new InnerClass();
		innerClass.hello();
	}
	
	class InnerClass {
		public void hello() {
			System.out.println("Hello World");
		}
		void print() {
			System.out.println("default method");
		}
	}

	
}

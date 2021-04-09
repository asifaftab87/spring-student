package org.la.student.aqsa;

public abstract class Abstract2 {

	void meth1() {
		
		System.out.println("non abstract method of Abstract class");
	}
	abstract void meth2();

}
class AbstractP2 extends Abstract2{
	@Override
	void meth2() {
		
		System.out.println("abstract method of Abstract class");
		
	}
}
class Demo2{
	public static void main(String[] args) {
		AbstractP2 obj = new AbstractP2();
		obj.meth1();
		obj.meth2();
	}
}

package org.la.student.aqsa;

public abstract class Abstract3 {
	
	void meth1() {
	
		System.out.println("non abstract method of Abstract class");
	}
	
	void meth2() {
		
		System.out.println("non abstract method of Abstract class");
	}

}
 
class AbstractC3 extends Abstract3{
	
   @Override
	void meth1() {
		super.meth1();
	}
	
   @Override
	void meth2() {
		super.meth2();
	}
   
}

class Demo3{
	
	public static void main(String[] args) {
		
		AbstractC3 obj = new AbstractC3();
		obj.meth1();
		obj.meth2();
	}
	
	
	
}

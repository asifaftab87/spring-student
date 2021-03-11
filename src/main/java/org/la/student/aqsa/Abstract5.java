package org.la.student.aqsa;

public abstract class Abstract5 {

	abstract void message();

}

class Child1 extends Abstract5 {

	@Override
	void message() {
		// TODO Auto-generated method stub
		System.out.println("This is first subclass");
		
	}
	
}
class Child2 extends Abstract5 {

	@Override
	void message() {
		// TODO Auto-generated method stub
		System.out.println("This is second subclass");
		
	}
	
}
class Demo5{
	public static void main(String[] args) {
		Child1 c1 = new Child1();
		Child2 c2 = new Child2();
		c1.message();
		c2.message();
	}
}

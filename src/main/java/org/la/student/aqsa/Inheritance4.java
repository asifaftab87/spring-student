package org.la.student.aqsa;

class X{
	
	static void staticMethod() {
		System.out.println("Class X");
	}
}
class Y extends X{
//	@Override  gives error 
// because we cannot override a static method memory will create a diff method 
	
	static void staticMethod() {   
		
		// super.staticMethod();  error whyy??????////////////////////////////
		// this.staticMethod();
		
		System.out.println("Class Y");	
	}
}
public class Inheritance4 {

	public static void main(String[] args) {

		Y.staticMethod();   
		//Child Class method call because parent class method has been hidden by child class method
	    X.staticMethod();
	}

}

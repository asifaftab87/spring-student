package org.la.student.aqsa;


public class Inheritance1 extends C {
	public static void main(String[] args) {
	
		    C c = new C();
		    c.methP3();
		    c.methC2();
		    System.out.println("  ");
			
		    B b = new C();
	     	b.methP3();
		    b.methC2();
	// 1st.	b.meth();      parent ref cant access child class method vice versa is possible
		    System.out.println("  ");
		
		    A a1 = new C();
		    a1.methP3();
	//2nd.  a1.methC1();  reference of class a can't access methodC1() which is in child class 
//	      a1.methC2();  parent reference can't access child class method,
//	                child class object can access parent class member method but parent object can't access child class method 
		    System.out.println("  ");
		
		
		    A a2 = new B(); // parent reference  can point to child object but can't access child class method
	//3rd. 	B b1 = new A();  but vice versa is not possible
//		    a2.methC1();
//	      a2.meth();
		    System.out.println("  ");
		
		    A a3 = new A();
		    a3.methP3();
//		    a3.methC1();   //parent ref a3 of class A and  method of child B
//		    a3.methC2();   //parent ref a3 of class A and  method of child B
//		    a3.meth();     //parent ref a3 of class A and  method of child C
		    System.out.println("  ");
		
		    B b2 = new C();
		    b2.methP3();
		    b2.methC2();
//		    b2.meth();      parent reference b3 of class B can't access child class C method 
		    System.out.println("  ");
		
		    B b3 = new B();
		    b2.methP3();
		    b2.methC2();
//		    b2.meth();  parent reference can't access child class method
		    System.out.println("  ");
		
	//4th.  C c = new A();  you cant make an object of parent class with child reference
//		    C c = new B();  method resolution is compile time ie reference  
//		    B b = new A();
		
		}
		


}

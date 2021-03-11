package org.la.student.aqsa;

public abstract class Abstract1 {
	
	abstract void meth1();
	abstract void meth2();
}
  abstract class AbstractP extends Abstract1{

	@Override
	void meth1() {
		 //implemented meth1 which was an abstract method in Abstract1 class which need needs to be implemented by the child class extending the parent class 
		
		System.out.println("method1 of AbstractP ");
	}
	 
 }
 class AbstractC extends AbstractP{
	 
	 @Override
	 void meth1() {
			
			System.out.println("method1 of AbstractC ");
		}
	 @Override
	 void meth2() {
			
		 //Implement meth2 from parent abstract meth2 of parent abstract class
			System.out.println("method2 of AbstractC");
		
			super.meth1(); // calling meth2 of parent class  AbstractP
		}
 }
 
 class Demo{
	 
	 public static void main(String[] args) {
	
		 AbstractC obj = new AbstractC();
		 obj.meth1();
		 obj.meth2();
		 
		/* AbstractP obj1 = new AbstractC();  possible but giving the same output because overriden method resolution are on the basis of runtime(while the creation of object).
		 obj1.meth1();
		 obj1.meth2();
		 
		 AbstractP obj = new AbstractP();  Cannot instantiate the abstract class AbstractP
		 
		*/ 
	 }
 }

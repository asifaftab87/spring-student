package org.la.student.aqsa;

public class C extends B {

// writing Override would give an error	
public void meth() {
	System.out.println("method of child class  C");
	}
   @Override
   public void methP1() {
		
		System.out.println("1st method of parent class");
	}

	@Override
	public void methP2() {
		methP1();
		System.out.println("2nd method of parent class");
	}

	@Override
	public void methP3() {
		 methP2();
	System.out.println("3rd method of parent class");
}

    @Override
	public  void methC1() {
	 System.out.println("1st method of child class B");
	 
 }
	@Override
	public  void methC2() {
		methC1();
		 System.out.println("2nd method of child class B");
	
	 }

	}

package org.la.student.tahir.interfce;

public interface  Human {

	 default void DefaultMethod(){
		
		System.out.println("Default concrete method of an interface");
	}
	
	void mesg();
	
	abstract void tahir();
	
}

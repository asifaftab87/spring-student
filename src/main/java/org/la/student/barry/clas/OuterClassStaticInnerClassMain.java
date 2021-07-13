package org.la.student.barry.clas;

import org.la.student.barry.clas.OuterClassStaticInnerClass.Earth;

public class OuterClassStaticInnerClassMain {
	
	public static void main(String ar[]) {
		//OuterClassStaticInnerClassMain outerClassStaticInnerClass= new OuterClassStaticInnerClassMain();
		
		Earth earth = new Earth();
		earth.atmosphere();
		
	}
	
	public void fun(){
		Earth earth = new Earth();
	}
}
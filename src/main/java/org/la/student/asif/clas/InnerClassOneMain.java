package org.la.student.asif.clas;

import org.la.student.asif.clas.InnerClassOne.InnerClass;

public class InnerClassOneMain {

	public static void main(String a[]) {
		
		InnerClassOne innerClassOne = new InnerClassOne();
		
		InnerClass innerClass = innerClassOne.new InnerClass();
		innerClass.hello();
		innerClass.print();
		
		new InnerClassOne().new InnerClass().hello();
		
	}

	
}

package org.la.student.noura.method;

public class ReturnMethod {

	public static void main(String[] args) {

		float y=div();
		System.out.println("main return value: "+y);
		
		System.out.println("this is main method");
		
		 boolean d=diff(2);
		 System.out.println("from diff method: "+d);
	}
	//return method
	 static float div() {
		 float d=4.3f;
		 return d;
	 }
	 
	 //return and accept the value
	 static boolean diff(int i) {
		 return i==2;
	 }
	 

}

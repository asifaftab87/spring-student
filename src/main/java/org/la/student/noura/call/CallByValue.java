package org.la.student.noura.call;

public class CallByValue {



		//calling method
		public static void main(String[] args) {
			
		
		int x=4;
		int y=5;
		System.out.println(x);
		System.out.println(y);
		
		value(x,y);
		
		System.out.println(x);
		System.out.println(y);
		
		}
		//called method
		static void value(int a , int b) {
			
			System.out.println("value before a: "+a);
			System.out.println("value before b: "+b);
			a=9;
			b=3;
			System.out.println("value after a: "+a);//call by value means no sharing memory
			System.out.println("value after b: "+b);
		

	}

}

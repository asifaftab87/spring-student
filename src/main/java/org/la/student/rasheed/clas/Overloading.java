package org.la.student.rasheed.clas;

public class Overloading {

	
		//Always remember the name of the argument doesn't matter, types real matters
		
		public void sum(int x, int y) {
			System.out.println("sum: "+(x+y));
			
		}//Argument are different, but the name of the method are same
		public void sum(int a, int b, int c) {
			System.out.println("sum: "+(a+b+c));
			
		}
		public void sum(boolean x, boolean y) {
			System.out.println("This is a boolean method");
		//This is called method overloading

	}
		public void sum(boolean x, int y) {
			System.out.println("This is a boolean method");
		//In this you can write any number of method argument, but u have to change the argument type 
		}
		public void sum(int x, boolean y) {
			System.out.println("This is a boolean method");
		}
		public void sum() {
			System.out.println("no argument");
			
		
		}
		
}

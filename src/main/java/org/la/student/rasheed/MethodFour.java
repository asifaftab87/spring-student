package org.la.student.rasheed;

public class MethodFour {

	public static void main(String[] args) {
		
		System.out.println("main start");
		int val = bothMethod(true);
		System.out.println("main end: "+val);
		
		//Whenever you call a method you have to receive that value; which is (int-val);  type of method
		//bothMethod; and what type of Argument is accepting these are the 3 important element in this program 
		//You call from the main method, if not so the program will not execute, even if it inside your program
		//if u do not call with the (Main) it will not execute
		// Always Remember Main is not a predefined method

	}
	
	// How to call a method ?
	//Answer; You have to give the name which is bothMethod, once you give te name the program will jump to below line shown 

	static int bothMethod(boolean b) {
		int i =9;
		System.out.println("display value: "+b);
		return i *10;
	}

}

package org.la.student.rasheed.method;

public class MethodTwo {

	public static void main(String[] args) {

		System.out.println("main start");
		display();//Here you call the method and you pass (100) has the value 
		System.out.println("main end");

	}//(2.) Not Returning But Accepting
	static int display() {//Here you pass the value INT and it will stored it in the (INT i)
		int i =9;
		System.out.println("value: "+i);
		
		return i;
		
	
	}
}

package org.la.student.rasheed.method;

public class MethodThree {

	public static void main(String[] args) {

		System.out.println("main start");
		int val = display();//Here you are storing the varaible here 
		System.out.println("main end: "+val);

	}//(3.)Returning But Not Accepting
	static int display() {//Here, these method is declaring a variable and just printing variable
		int i =9;
		System.out.println("value: "+i);
		return i*10;
		
	
	}
}

package org.la.student.rasheed.method;

public class MethodFour {

	public static void main(String[] args) {
		
		System.out.println("main start");
		int val = bothMethod(true);//Here you are storing the varaible here 
		System.out.println("main end: "+val);

	}//(4.0)accepting and Returning 
	static int bothMethod(boolean b) {//Here there are no relationship btw (INT & BOOLEAN IN THIS)
		//Here, these method is declaring a variable and just printing variable, and pass it
		int i =9;
		System.out.println("value: "+b);
		return i*10;
		

	}

}

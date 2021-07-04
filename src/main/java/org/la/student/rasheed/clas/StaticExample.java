package org.la.student.rasheed.clas;

public class StaticExample {
	
	
	public int id;
	public static String name;
	
	
	public void print() { // Here is instance method 
		String n = name;
		System.out.println("instance print method");
		display();
	}
	
	public static void display() { //Here is static method
		StaticExample se = new StaticExample();
		System.out.println("static display method");
		se.print();
	}
	

}

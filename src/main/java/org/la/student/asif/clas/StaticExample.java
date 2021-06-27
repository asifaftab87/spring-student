package org.la.student.asif.clas;

public class StaticExample {

	public int id;
	public static String name;
	
	//instance method
	public void print() {
		String n = name;
		System.out.println("Instance print method: ");
		display();
	}
	
	//static method
	public static void display() {
		StaticExample se = new StaticExample();
		System.out.println("Static display method: "+se.id);
		se.print();
	}
}

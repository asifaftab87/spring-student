package org.la.student.noor;

public class StaticEg {
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
		StaticEg se = new StaticEg();
		System.out.println("Static display method: "+se.id);
		se.print();
	}
}

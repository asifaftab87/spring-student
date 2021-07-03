package org.la.student.noor;

public class StaticEgMain {
	public static void main(String[] args) {

		StaticEg se1 = new StaticEg();
		StaticEg se2 = new StaticEg();
		StaticEg se3 = new StaticEg();

		se1.id = 1;
		se2.id = 2;
		se3.id = 3;

		StaticEg.name = "one";
		StaticEg.name = "two";
		StaticEg.name = "three";

		System.out.println("se1.id: "+se1.id);
		System.out.println("se2.id: "+se2.id);
		System.out.println("se3.id: "+se3.id);

		System.out.println("StaticExample.name: "+StaticEg.name);
		System.out.println("StaticExample.name: "+StaticEg.name);
		System.out.println("StaticExample.name: "+StaticEg.name);
	}
}

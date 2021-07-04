package org.la.student.rasheed.clas;

public class StaticExampleMain {

	public static void main(String[] args) {
		
		StaticExample se1 = new StaticExample(); // Here we created 3 object
		StaticExample se2 = new StaticExample();
		StaticExample se3 = new StaticExample();
		
		
		se1.id = 1;
		se2.id = 2;
		se3.id = 3;
		
		
		StaticExample.name = "one";  // Here even after assigning 3 variable, it will be access only 1 variable
		StaticExample.name = "two";
		StaticExample.name = "three";
		
		System.out.println("se1.id: "+se1.id);
		System.out.println("se2.id: "+se2.id);
		System.out.println("se3.id: "+se3.id);
		
		
		System.out.println("StaticExample.name: "+StaticExample.name);
		System.out.println("StaticExample.name: "+StaticExample.name);
		System.out.println("StaticExample.name: "+StaticExample.name);

	}

}

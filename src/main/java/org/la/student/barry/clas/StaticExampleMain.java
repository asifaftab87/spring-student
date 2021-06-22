package org.la.student.barry.clas;

public class StaticExampleMain {

	public static void main(String[] args) {
		
		StaticExample se1=new StaticExample();
		StaticExample se2=new StaticExample();
		StaticExample se3=new StaticExample();
		
		se1.id=1;
		se2.id=2;
		se3.id=3;
		
		StaticExample.name="One";
		StaticExample.name="two";
		StaticExample.name="three";
		
		System.out.println("se1.id "+se1.id);
		System.out.println("se2.id "+se2.id);
		System.out.println("se3.id "+se3.id);
		
		System.out.println("StaticExample.name "+StaticExample.name);
		System.out.println("StaticExample.name "+StaticExample.name);
		System.out.println("StaticExample.name "+StaticExample.name);
		
	}

}

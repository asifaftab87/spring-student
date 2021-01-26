package org.la.student.nawaz;

public class MethodOverloading {
	
	public static void main(String[] args) {
		
		Show();
		Show(1);
		
		
	}
	
	public static void Show() {
		
		System.out.println("This is the First Show");
	}
	
	public static void Show(int a) {
		
		System.out.println("This is the Second Show");
	}

}

package org.la.student.bakil.overloading_and_constructor;

public class StaticEx {



	public int id; //instance 
	public static String name ; //static
	
	public void print () {
		
		System.out.println("Instance method");
	}
	
	public static void display () {
		
		StaticEx st = new StaticEx();
		System.out.println("Static method"+st.id);
	}
	}



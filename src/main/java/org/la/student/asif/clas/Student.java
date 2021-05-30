package org.la.student.asif.clas;

public class Student {
	
	int roll;
	String name;
	int standard;
	
	void print() {
		System.out.println("roll: "+roll);
		System.out.println("name: "+name);
		System.out.println("standard: "+standard);
	}

	public static void main(String[] args) {
		
		Student student = new Student();
		
		student.roll = 2;
		student.name = "asif";
		student.standard = 3;
		student.print();
		
		System.out.println("-----------------------");
		Student student2 = new Student();
		student2.roll = 90;
		student2.name = "jawed";
		student2.standard = 1;
		student2.print();
		
	}
}

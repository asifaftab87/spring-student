package org.la.student.sajid.call;

public class StudentMain {
	public static void main(String[] args) {
		Student student =new Student ();
		student.setId(5);
		student.setName("Sajid");
		
		System.out.println("first time "+student.getId());
		System.out.println("first time "+student.getName());
		
		value(student.getId(),student.getName());
		
		System.out.println("call by value "+student.getId());
		System.out.println("call by value "+student.getName());
		
		reference(student); 
		
		System.out.println("call by reference "+student.getId());
		System.out.println("call by reference "+student.getName());
		
	}
	
	static void value(int a,String n) {
		a=10;
		n="prince";
		System.out.println("changed value "+a);
		System.out.println("changed value "+n);
	}
	
	static void reference(Student s) {
		s.setId(33);
		s.setName("Arif");
		System.out.println("changed reference "+s.getId());
		System.out.println("changed reference "+s.getName());
	}

}

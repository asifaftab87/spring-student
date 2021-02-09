package org.la.student.sajid.cls;

public class StundentMain {
	public static void main(String[] args) {
		Student student=new Student();
		
		student.setRollNumber(5);
		student.setName("Sajid");
		
		System.out.println("Roll Number: "+student.getRollNumber());
		System.out.println("Name: "+student.getName());
//		called by reference
		reference(student);
		System.out.println("after reference :"+student.getName());
		System.out.println("After reference :"+student.getRollNumber());
//		called by Value
		value(student.getRollNumber(),student.getName());
		System.out.println("after value :"+student.getName());
		System.out.println("After value :"+student.getRollNumber());
	}
	
	static void reference(Student s) {
		System.out.println("reference rollNumber: "+s.getRollNumber());
		System.out.println("reference Name: "+s.getName());
		s.setName("Prince");
		s.setRollNumber(100);
	}

	static void value(int i, String n) {
		System.out.println("Value rollNumber: "+i);
		System.out.println("Value Name: "+n);
		i=15;
		n="Sadique";
	}
	

}

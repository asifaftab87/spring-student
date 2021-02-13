package org.la.student.asif.call;

public class StudentMain {

	public static void main(String[] args) {
		
		
		Student student = new Student();
	
		student.setId(1);
		student.setName("asif");
		
		System.out.println("id: "+student.getId());
		System.out.println("name: "+student.getName());
		value(student.getId(), student.getName());
		reference(student);
		System.out.println("after id: "+student.getId());
		System.out.println("after name: "+student.getName());
		
	}
	static void reference(Student s) {
		System.out.println("id: "+s.getId());
		System.out.println("name: "+s.getName());
		s.setName("jawed");
		s.setId(455);
		
	}
	
	static void value(int x, String i) {
		System.out.println("x: "+x);
		System.out.println("i: "+i);
		x = 33;
		i = "jawed";
	}

}

package org.la.student.noura.call;

import org.la.student.asif.call.Student;

public class StudentMain {

	public static void main(String[] args) {


	

		Student student = new Student();
		student.setId(1);
		student.setName("asif");
		System.out.println("id: "+student.getId());
		System.out.println("name: "+student.getName());
		
		
		value(student.getId(), student.getName());

		System.out.println("after the value id: "+student.getId());
		System.out.println("after the value  name: "+student.getName());
		
		reference(student);
		System.out.println("after the reference id: "+student.getId());
		System.out.println("after the reference  name: "+student.getName());
		
	}
	
	static void reference(Student s) {//creating another object of student data type with value s
		System.out.println("id:"+s.getId());
		System.out.println("name:"+s.getName());
		s.setId(3);
		s.setName("noura");
		
		
	}
	static void value(int x, String i) {
		System.out.println("x: "+x);
		System.out.println("i: "+i);
		x = 33;
		i = "jawed";
		System.out.println("value after x: "+x);
		System.out.println("value after i: "+i);
	
	}

	}


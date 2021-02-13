package org.la.student.asif.clas;

import org.la.student.asif.call.Student;

public class DiffPackageConcept {

	public static void main(String[] args) {
		
		Student student = new Student();
		
		student.setId(1);
		student.setName("jamil");
		
		System.out.println("id: "+student.getId());
		System.out.println("nanme: "+student.getName());

	}

}

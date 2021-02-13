package org.la.student.asif.clas;

import org.la.student.asif.call.Student;

public class DiffPackageConceptTwoClassName {

	public static void main(String[] args) {
		
		Student student = new Student();
		
		student.setId(1);
		student.setName("jamil");
		
		System.out.println("id: "+student.getId());
		System.out.println("nanme: "+student.getName());
		
		org.la.student.asif.clas.Student student2 = new org.la.student.asif.clas.Student();
		student2.setEmail("email.id");
		student2.setMobile("39543259");

	}

}

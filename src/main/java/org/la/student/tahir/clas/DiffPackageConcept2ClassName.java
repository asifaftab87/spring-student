package org.la.student.tahir.clas;

import org.la.student.tahir.cal.Student;


public class DiffPackageConcept2ClassName {

	public static void main(String[] args) {
	
		
		Student student = new Student();
		
		student.neew();
		
		student.setId(20);
		student.setName("Zainab");
		
		System.out.println(student.getId());
		System.out.println(student.getName());
		
		org.la.student.asif.clas.Student student2 = new org.la.student.asif.clas.Student();
		student2.setEmail("tahirdalori1@yahoo.com");
		student2.setName("Tahir");
		student2.setId(82);
		
		System.out.println(student2.getId());
		System.out.println(student2.getName());
		System.out.println(student2.getEmail());

	}

}

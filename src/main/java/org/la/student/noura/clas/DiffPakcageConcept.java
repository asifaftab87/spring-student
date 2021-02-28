package org.la.student.noura.clas;

import org.la.student.noura.call.Student;

public class DiffPakcageConcept {

	public static void main(String[] args) {
		
		
		Student student= new Student();    //Student class from other package 
		                                   //so we have to import that package 
                                           //where the Student class involved in
		
		student.setName("Noura");
		student.setId(38234682);
		System.out.println("name :  "+student.getName());
		System.out.println("student id : "+student.getId());
		
		org.la.student.noura.clas.Student student2 = new org.la.student.noura.clas.Student();
		
		student2.setEmail("niu.hotmail.com");
		student2.setMobile("0553423423");
		
		System.out.println(student2.getMobile());     //

	}

}

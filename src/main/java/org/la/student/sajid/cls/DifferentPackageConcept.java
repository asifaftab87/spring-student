package org.la.student.sajid.cls;

import org.la.student.asif.call.Student;

public class DifferentPackageConcept {

	public static void main(String[] args) {
		Student stud= new Student();
		stud.setId(12);
		stud.setName("saddaf");
		System.out.println("id: "+stud.getId()+", Name:"+stud.getName());
		

	}

}

package org.la.student.noura.clas;

import org.la.student.asif.clas.Student;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student = new Student();
		Student student2 = null;
		System.out.println("student: "+student);
		System.out.println("student2: "+student2);
		
		int id = student.getId();
		System.out.println("student.id: "+id);
		
		if(student2!=null) {
			int id2 = student2.getId();
			System.out.println("student2.id: "+id2);
		}

	}

}

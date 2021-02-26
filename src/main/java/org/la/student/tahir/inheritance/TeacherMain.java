package org.la.student.tahir.inheritance;

import org.la.student.tahir.method.Teacher;

public class TeacherMain extends Teacher {
	
	void Doesn(){
		
		Does();
		
		
	}
	
	
	public static void main(String[] args) {
		
		String mainsubject = "Physics";
		Teacher teacher = new TeacherMain();
		System.out.println("Designation: " + teacher.getDesignation());
		System.out.println("College Name: "+ teacher.getCollegename());
		System.out.println("Main subject: "+ mainsubject);
		
		Does();
		TeacherMain n = new TeacherMain();
	n.Doesn();
		
		
	}

}

package org.la.student.tahir.inheritance;

public class PhysicsTeacher extends Teacher {

	public static void main(String[] args) {
	

		String mainSubject = "Physics";
		
		Teacher teacher = new PhysicsTeacher();
		
		System.out.println("College name is: " + teacher.collegename);
		System.out.println("Designation: "+ teacher.designation);
		System.out.println("Main Subject: "+ mainSubject);
		teacher.Does();
		
		
	}

}

package org.la.student.tahir.clas;

public class SchoolMain {

	public static  void main (String arg[]) {
		
		Student student = new Student(1,"tahir","@yahoo", "080");
		
		
		School school = new School();
		school.setName("Musa");
		school.setStudent(student);
		
		String email=  school.getStudent().getEmail();
		System.out.println(email);
		System.out.println(school.getName());
		
		
	}
	
}

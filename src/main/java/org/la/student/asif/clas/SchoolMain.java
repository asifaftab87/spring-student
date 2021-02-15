package org.la.student.asif.clas;

public class SchoolMain {

	public static void main(String[] args) {
		
		Student student = new Student(1, "jain", "id@mail.com", "734502");
		
		
		School school = new School();
		school.setName("wahed");
		school.setStudent(student);
		
		String email = school.getStudent().getEmail();
		System.out.println("email: "+email);
		System.out.println("name: "+school.getName()); 
	}
}

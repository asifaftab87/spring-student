package org.la.student.asif.clas;

public class StudentMain2 {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.display();
		
		Student student2 = new Student(11, "asif", "asifaftab87@mail.com", "90504852");
		student2.display();
	}
}

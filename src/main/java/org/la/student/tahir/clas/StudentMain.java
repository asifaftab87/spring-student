package org.la.student.tahir.clas;


public class StudentMain {

	public static void main(String[] args) {
	
		Student s = new Student();
		s.setMobile("080");
	s.display();
	
	Student s2 = new Student(1, "asif", "asifaftab87@mail.com", "90504852");
	s2.setMobile("081");
	s2.display();
	s.setMobile("082");
	String mobile = s.getMobile();
	System.out.println(mobile);

	}

}

package org.la.student.aqsa;

public class StudentMain {
	
	public static void main(String[] args) {
		
		StudentModel s = new StudentModel();
		s.setrollNo(41);
		s.setstandard(8);
		s.setid(6677);
		s.setName("Md");
		s.setfatherName("ff");
		s.setemail("md@gmail.com");
		s.setplace("Delhi");
		s.setnationality("India");
		
		StudentMain studentmain = new StudentMain();
		StudentDto studentDto = studentmain.studentToStudentDto(s);
		
		System.out.println(studentDto);
	}
	public StudentDto studentToStudentDto(StudentModel student) {
		
		StudentDto dto = new StudentDto();
		dto.setrollNo(student.getrollNo());
		dto.setstandard(student.getstandard());
		dto.setid(student.getid());
		dto.setName(student.getName());
		dto.setfatherName(student.getfatherName());
		dto.setemail(student.getemail());
		dto.setplace(student.getplace());
		dto.setnationality(student.getnationality());
	
	return dto;
	}

}

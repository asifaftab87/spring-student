package org.la.student.aqsa;

import org.dozer.DozerBeanMapper;

public class StudentMapper {
	
	DozerBeanMapper mapper = new DozerBeanMapper();
	
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
		
		StudentMapper student = new StudentMapper();

		StudentDto studentdto =student.studentToStudentDto(s);
		
		System.out.println(studentdto);
}

public StudentDto studentToStudentDto(StudentModel student) {
	
	StudentDto dto = mapper.map(student, StudentDto.class);
	return dto;
}
}

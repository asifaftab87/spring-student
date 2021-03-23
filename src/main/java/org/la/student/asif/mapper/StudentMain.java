package org.la.student.asif.mapper;

import org.dozer.DozerBeanMapper;
import org.la.student.asif.dto.StudentDto;
import org.la.student.asif.model.Student;

public class StudentMain {

	DozerBeanMapper mapper = new DozerBeanMapper();
			
	public static void main(String[] args) {
		
		Student student = new Student();
		
		student.setId(1);
		student.setName("asif");
		student.setEmail("asif@mail.com");
		student.setRoll(11);
		student.setFatherName("aftab");
		student.setStandard(1);
		
		StudentMain studentMain = new StudentMain();
		StudentDto studentDto = studentMain.studentToStudentDto(student);
		//StudentDto studentDto = studentMain.studentToStudentDtoMapper(student);
		System.out.println(studentDto); 	
	}
	
	
	public StudentDto studentToStudentDto(Student student) {
		
		StudentDto dto = new StudentDto();
		dto.setId(student.getId());
		dto.setName(student.getName());
		dto.setEmail(student.getEmail());
		dto.setRoll(student.getRoll());
		dto.setFatherName(student.getFatherName().toUpperCase());
		dto.setStandard(student.getStandard());
		return dto;
	}
	
	public StudentDto studentToStudentDtoMapper(Student student) {
		StudentDto dto = mapper.map(student, StudentDto.class);
		return dto;
	}
	
	
	
}

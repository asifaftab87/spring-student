package org.la.student.sajid.model.mapper;

import org.dozer.DozerBeanMapper;
import org.la.student.sajid.dto.StudentDto;
import org.la.student.sajid.model.Student;

public class StudentMain {

	DozerBeanMapper mapper = new DozerBeanMapper();

	public static void main(String[] args) {

		Student student = new Student();

		student.setId(1);
		student.setName("Sajid");
		student.setEmail("sajid@gmail,com");
		student.setRoll(5);
		student.setFatherName("Naushad");
		student.setStandar(9);

		StudentMain studentMain = new StudentMain();
//		StudentDto studentDto = studentMain.studentToStudentDto(student);
//		System.out.println(studentDto);

		StudentDto studentDto = studentMain.studentToStudentDtoMapper(student);
		System.out.println(studentDto);

	}

	public StudentDto studentToStudentDto(Student student) {

		StudentDto dto = new StudentDto();

		dto.setId(student.getId());
		dto.setName(student.getName());
		dto.setEmail(student.getEmail());
		dto.setRoll(student.getRoll());
		dto.setFatherName(student.getFatherName().toUpperCase());
		dto.setStandar(student.getStandar());
		return dto;

	}

	public StudentDto studentToStudentDtoMapper(Student student) {
		StudentDto dto = mapper.map(student, StudentDto.class);
		return dto;
	}

}

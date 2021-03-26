package org.la.student.tahir.mapper;

import org.dozer.DozerBeanMapper;
import org.la.student.tahir.dto.TeacherDto;
import org.la.student.tahir.model.Teacher;

public class TeacherMain {

	DozerBeanMapper mapper = new DozerBeanMapper();
	
	public static void main(String[] args) {
	
		Teacher teacher = new Teacher();
		
		teacher.setname("Asif");
		teacher.setId(6);
		teacher.setTeacherId(5);
		teacher.setDob("25-09-1952");
		teacher.setEmail("asif1@mail.com");
		teacher.setFatherName("aftab");
		
		TeacherMain main = new TeacherMain();
		
		System.out.println(main.TeacherToTeacherDto(teacher));
		System.out.println(main.TeacherToTeacherDtoMapper(teacher));
		

	}

	public TeacherDto TeacherToTeacherDto(Teacher teacher) {
		
		TeacherDto dto =  new TeacherDto();
		
		dto.setname(teacher.getName());
		dto.setId(teacher.getId());
		dto.setTeacherId(teacher.getTeacherId());
		dto.setDob(teacher.getDob());
		dto.setEmail(teacher.getEmail());
		dto.setFatherName(teacher.getFatherName());
		
		return dto;
		
		
	}
	

	public TeacherDto TeacherToTeacherDtoMapper(Teacher teacher) {
		
		TeacherDto dto = mapper.map(teacher, TeacherDto.class);
		
		return dto;
	}
		
}

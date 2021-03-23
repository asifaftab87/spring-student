package org.la.student.tahir.mapper;


import org.dozer.DozerBeanMapper;
import org.la.student.tahir.dto.StudentDto;
import org.la.student.tahir.model.Student;

public class StudentMain {

	 DozerBeanMapper mapper = new DozerBeanMapper();
	public static void main(String[] args) {
		
	
		
		
		Student student = new Student();
		
		student.setId(01);
		student.setName("Tahir");
		student.setEmail("tahirdalori1@gmail.com");
		student.setRoll(555);
		student.setFatherName("Alh Abba");
		student.setStandard(5);
		
		StudentMain main = new StudentMain();
		
		//System.out.println(main.studenToStudentDto(student));
		
		
		System.out.println(main.studentToStudentDtoMapper(student));
		

	}
	
	/*public StudentDto studenToStudentDto( Student student) {
		
		StudentDto dto = new  StudentDto();
		
		dto.setId(student.getId());
		dto.setName(student.getName());
		dto.setEmail(student.getEmail());
		dto.setFatherName(student.getFatherName());
		dto.setRoll(student.getRoll());
		dto.setStandard(student.getStandard());
		
		
		return dto;
		
	}*/
	
	
	
	
	public StudentDto studentToStudentDtoMapper(Student student ) {
		
		StudentDto dto = mapper.map(student, StudentDto.class);
		
		return dto;
	}

}

package org.la.student.tahir.mapper;

import org.dozer.DozerBeanMapper;
import org.la.student.tahir.dto.Student1Dto;
import org.la.student.tahir.model.Student1;

public class Student1Main {

	DozerBeanMapper mapper = new DozerBeanMapper();
	
	public static void main(String[] args) {
	
		Student1 student1 = new Student1();
		 student1.setname("Tahir");
		 student1.setId(903);
		 student1.setSchoolId(110054185);
		 student1.setDob("01-12-2020");
		 student1.setEmail("tahirdalori1@gmail.com");
		 
		 Student1Main main = new Student1Main();
		 
		 System.out.println(main.Student1ToStudent1Dto(student1));
		 System.out.println(main.Student1ToStudent1DtoMapper(student1));
	}
	
	public Student1Dto Student1ToStudent1Dto(Student1 student1) {
		
		Student1Dto student1Dto = new Student1Dto();
		
		student1Dto.setname(student1.getName());
		student1Dto.setId(student1.getId());
		student1Dto.setSchoolId(student1.getSchoolId());
		student1Dto.setDob(student1.getDob());
		student1Dto.setEmail(student1.getEmail());
		
		return student1Dto;
	}
	
public Student1Dto Student1ToStudent1DtoMapper(Student1 student1) {
		
		Student1Dto student1Dto = mapper.map(student1, Student1Dto.class);
		
		return student1Dto;
	
}

}

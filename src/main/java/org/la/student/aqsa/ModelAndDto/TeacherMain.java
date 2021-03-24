package org.la.student.aqsa.ModelAndDto;

import org.dozer.DozerBeanMapper;

public class TeacherMain {
	
	DozerBeanMapper mapper = new DozerBeanMapper();
	
public static void main(String[] args) {
	Teacher t = new Teacher();
	t.setId(11);
	t.setName("khan");
	t.setSchoolId(77);
	t.setTeacherId(88);
	t.setFatherName("kk");
	t.setEmail("@gmail.com");
	t.setDob("9/1/1999");
	
	TeacherMain teachermain = new TeacherMain();
	TeacherDto dto = teachermain.teacherToTeacherDto(t); 
	System.out.println(dto+ "  Manually");
	
	TeacherDto dtoMapper = teachermain.teacherToTeacherDtoMapper(t); 
	System.out.println(dtoMapper+"  Using Mapper");

}

public TeacherDto teacherToTeacherDtoMapper(Teacher t) {
	
	TeacherDto dtoMapper = mapper.map(t, TeacherDto.class);
	
	return dtoMapper;
}

public TeacherDto teacherToTeacherDto(Teacher t) {
	TeacherDto dto = new TeacherDto();
	dto.setId(t.getId());
	dto.setDob(t.getDob());
	dto.setEmail(t.getEmail());
	dto.setFatherName(t.getFatherName());
	dto.setName(t.getName());
	dto.setSchoolId(t.getSchoolId());
	dto.setTeacherId(t.getTeacherId());
	return dto;
}
}

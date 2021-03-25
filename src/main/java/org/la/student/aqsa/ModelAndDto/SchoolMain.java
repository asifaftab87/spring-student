package org.la.student.aqsa.ModelAndDto;

import org.dozer.DozerBeanMapper;

public class SchoolMain {
	
	DozerBeanMapper mapper = new DozerBeanMapper();

	public static void main(String[] args) {
		School school = new School();
		school.setSchoolId(77);
		school.setName("KMHS");
		school.setRegistrationDate("25/8/2017");
		school.setMedium("Bengali");
		school.setAddress("Kidderpore");
		
		SchoolMain schoolmain = new SchoolMain();
		SchoolDto dto = schoolmain.schoolToSchoolDto(school);
		
	System.out.println(dto+ "    NORMAL");
	
	SchoolDto dtoMapper = schoolmain.schoolToSchoolDtoMapper(school);
	
	System.out.println(dtoMapper+ "   MAPPER");
	
	}

	public SchoolDto schoolToSchoolDto(School school) {
		SchoolDto dto = new SchoolDto();
		dto.setSchoolId(school.getSchoolId());
		dto.setName(school.getName());
		dto.setRegistrationDate(school.getRegistrationDate());
		dto.setMedium(school.getMedium());
		dto.setAddress(school.getAddress());
		
		return dto;
	}
	
	public SchoolDto schoolToSchoolDtoMapper(School school) {
		
		SchoolDto dtoMapper = mapper.map(school, SchoolDto.class);
		return dtoMapper;


	}
}
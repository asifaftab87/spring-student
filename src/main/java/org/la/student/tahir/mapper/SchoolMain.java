package org.la.student.tahir.mapper;

import org.dozer.DozerBeanMapper;
import org.la.student.tahir.dto.SchoolDto;
import org.la.student.tahir.model.School;

public class SchoolMain {

	DozerBeanMapper mapper = new DozerBeanMapper();
	public static void main(String[] args) {
		
		School school = new School();
		
		school.setName("IOU");
		school.setAddress("Qatar");
		school.setMedium("Online");
		school.setSchoolId(110054185);
		school.setRegistrationDate("05-05-2021");
		
		SchoolMain main = new SchoolMain();
		
		System.out.println(main.SchoolToSchoolDto(school));
		System.out.println(main.SchoolToSchoolDtoMapper(school));
		
		
		
	}
	
	
	public SchoolDto SchoolToSchoolDto(School school) {
		
		SchoolDto dto = new SchoolDto();
		
		dto.setName(school.getName());
		dto.setAddress(school.getAddress());
		dto.setMedium(school.getMedium());
		dto.setSchoolId(school.getSchoolId());
		dto.setRegistrationDate(school.getRegistrationDate());
		return dto;
		
		
	}
	

	public SchoolDto SchoolToSchoolDtoMapper(School school) {
		
		SchoolDto dto = mapper.map(school, SchoolDto.class);
		
		return dto;
	}

	
}

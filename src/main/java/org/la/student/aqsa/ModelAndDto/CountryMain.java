package org.la.student.aqsa.ModelAndDto;

import org.dozer.DozerBeanMapper;

public class CountryMain {
	
	DozerBeanMapper mapper = new DozerBeanMapper();
	
	public static void main(String[] args) {
		Country c = new Country();
		c.setCountryId(999);
		c.setEmail("@gmail.com");
		c.setIndependenceDate("15Aug 1947");
		c.setName("India");
		c.setPhoneCode(91);
		c.setRepublicDate("26Jan 1947");
		
		CountryMain cmain = new CountryMain();
		CountryDto dto = cmain.countryToCountryDto(c);
		System.out.println(dto);
		
		CountryDto dtoMapper = cmain.countryToCountryDtoMapper(c);
		System.out.println(dtoMapper+"   Mapper");
	}

	public CountryDto countryToCountryDtoMapper(Country c) {
		CountryDto dtoMapper = mapper.map(c, CountryDto.class);
		return dtoMapper;
	}

	public CountryDto countryToCountryDto(Country c) {
		CountryDto dto = new CountryDto();
			dto.setCountryId(c.getCountryId());
		    dto.setEmail(c.getEmail());
		    dto.setIndependenceDate(c.getIndependenceDate());
		    dto.setName(c.getName());
		    dto.setPhoneCode(c.getPhoneCode());
		    dto.setRepublicDate(c.getRepublicDate());
		return dto;
	}

}

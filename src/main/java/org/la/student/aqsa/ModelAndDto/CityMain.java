package org.la.student.aqsa.ModelAndDto;

import org.dozer.DozerBeanMapper;

public class CityMain {
	DozerBeanMapper mapper =new DozerBeanMapper();
	public static void main(String[] args) {
		City c = new City();
		c.setCityCode(99);
		c.setCityId(1234);
		c.setCountryId(88);
		c.setName("kolkata");
		c.setStateId(11);
		
		CityMain citymain = new CityMain();
		CityDto dto = citymain.cityToCityDto(c);
		System.out.println(dto);
		
		CityDto dtoMapper = citymain.cityToCityDtoMapper(c);
		System.out.println(dtoMapper+"  Mapper");
	}

	public CityDto cityToCityDtoMapper(City c) {
		CityDto dtoMapper = mapper.map(c, CityDto.class);
		
		return dtoMapper;
	}

	public CityDto cityToCityDto(City c) {
		CityDto dto = new CityDto();
		dto.setCityCode(c.getCityCode());
		dto.setCityId(c.getCityId());
		dto.setCountryId(c.getCountryId());
		dto.setName(c.getName());
		dto.setStateId(c.getStateId());
		return dto;
	}

}

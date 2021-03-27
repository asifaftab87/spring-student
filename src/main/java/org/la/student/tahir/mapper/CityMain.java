package org.la.student.tahir.mapper;

import org.dozer.DozerBeanMapper;
import org.la.student.tahir.dto.CityDto;
import org.la.student.tahir.model.City;

public class CityMain {

	DozerBeanMapper mapper = new DozerBeanMapper();
	
	public static void main(String[] args) {
		
		City city = new City();
		
		city.setName("Cyberjaya");
		city.setCityId(6669);
		city.setStateId(987);
		city.setCountryId(564);
		city.setCityCode(777);
		
		CityMain main = new CityMain();
		
		System.out.println(main.CitytoCityDto(city));
		System.out.println(main.CitytoCityDtoMapper(city));
		
		

	}
	
	public CityDto CitytoCityDto(City city) {
		
		CityDto dto = new CityDto();
		
		dto.setName(city.getName());
		dto.setCityId(city.getCityId());
		dto.setStateId(city.getStateId());
		dto.setCountryId(city.getCountryId());
		dto.setCityCode(city.getCityCode());
		
		return dto;
	}
	
	public CityDto CitytoCityDtoMapper(City city) {
		
		CityDto dto = mapper.map(city, CityDto.class);
		
		return dto;
}

}

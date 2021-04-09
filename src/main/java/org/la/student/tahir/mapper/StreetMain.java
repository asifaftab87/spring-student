package org.la.student.tahir.mapper;

import org.dozer.DozerBeanMapper;
import org.la.student.tahir.dto.StreetDto;
import org.la.student.tahir.model.Street;


	
public class StreetMain {
	
	DozerBeanMapper mapper = new DozerBeanMapper();

	public static void main(String[] args) {


		Street street = new Street();
		
		street.setName("Cyber");
		street.setStreetId(10);
		street.setPostcode(6600);
		street.setCityId(123);
		street.setStateId(456);
		street.setCityId(789);
		street.SetAddress("F-11-17");
		street.setCountryId(908);
		
		StreetMain main = new StreetMain();
		
		System.out.println(main.StreetToStreetDto(street));
		System.out.println(main.StreetToStreetDtoMapper(street));

	}
	
	public StreetDto StreetToStreetDto(Street street) {
		
		StreetDto dto = new StreetDto();
		
		dto.setName(street.getName());
		dto.setStreetId(street.getStreetId());
		dto.setPostcode(street.getPostcode());
		dto.setCityId(street.getCityId());
		dto.setStateId(street.getStateId());
		dto.setCityId(street.getCityId());
		dto.SetAddress(street.getAddress());
		dto.setCountryId(street.getCountryId());
		
		return dto;
	}
	
public StreetDto StreetToStreetDtoMapper(Street street) {
		
		StreetDto dto = mapper.map(street, StreetDto.class);
		
		
		return dto;
		
}

}

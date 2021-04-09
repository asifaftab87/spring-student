package org.la.student.aqsa.ModelAndDto;

import org.dozer.DozerBeanMapper;

public class StreetMain {
	
	DozerBeanMapper mapper = new DozerBeanMapper();
	
	public static void main(String[] args) {
		Street s = new Street();
		s.setName("Park Street");
		s.setAddress("@parskreet");
		s.setStreetId(187);
		s.setCityId(223);
		s.setStateId(930);
		s.setPostcode(677);
		s.setCountryId(4001);
		
		StreetMain smain = new StreetMain();
		StreetDto dto = smain.streetToStreetDto(s);
		System.out.println(dto);
		
		StreetDto dtoMapper = smain.streetToStreetDtoMapper(s);
		System.out.println(dtoMapper+"  Mapper");
		
		
	}

	public StreetDto streetToStreetDtoMapper(Street s) {
		StreetDto dtoMapper = mapper.map(s, StreetDto.class);
		return dtoMapper;
	}

	public StreetDto streetToStreetDto(Street s) {
		StreetDto dto = new StreetDto();
		dto.setAddress(s.getAddress());
		dto.setCityId(s.getCityId());
		dto.setCountryId(s.getCountryId());
		dto.setName(s.getName());
		dto.setPostcode(s.getPostcode());
		dto.setStateId(s.getStateId());
		dto.setStreetId(s.getStreetId());
			
		return dto;
	}

}

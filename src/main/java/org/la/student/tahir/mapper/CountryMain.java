package org.la.student.tahir.mapper;

import org.dozer.DozerBeanMapper;
import org.la.student.tahir.dto.Countrydto;
import org.la.student.tahir.model.Country;

public class CountryMain {

	DozerBeanMapper mapper = new DozerBeanMapper();
	
	
	public static void main(String[] args) {
	
		Country country = new Country();
		
		country.setName("Nigeria");
		country.setEmail("tahirdalori1@gmail.com");
		country.setCountryId(22);
		country.setPhoneCode("+234");
		country.setIndependenceDate("01-Oct-1960");
		country.setRepublicDate("29-May-2021");
		
		
		CountryMain main = new CountryMain();
		
		System.out.println(main.countryToCountryDto(country));
		System.out.println(main.countryToCountryDtoMapper(country));
		
		

	}
	
	
	public Countrydto countryToCountryDto(Country country) {
		
		Countrydto dto = new Countrydto();
		
		dto.setName(country.getName());
		dto.setEmail(country.getEmail());
		dto.setCountryId(country.getCountryId());
		dto.setPhoneCode(country.getPhoneCode());
		dto.setIndependenceDate(country.getIndependenceDate());
		dto.setRepublicDate(country.getRepublicDate());
		
		return dto;
	}
	
	public Countrydto countryToCountryDtoMapper(Country country) {
		
		Countrydto dto = mapper.map(country, Countrydto.class);
		
		return dto;
	}
	
	

}

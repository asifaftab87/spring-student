package org.la.student.tahir.jdbc.service;



import java.util.List;

import org.la.student.tahir.jdbc.model.City;
import org.la.student.tahir.jdbc.repository.CityRepository;

public class CityService {

	
	public CityService() {
		
		CityRepository.connectionOpen();
	}
	
	public List<City> findAll(){
		List<City> city1 = CityRepository.findAll();
		return city1;
	}
	
/*	public List<City> findByCity(String city){
		List<City> city1 = CityRepository.findByCity(city);
		return city1;
	}
	
	
	public City findById(int id){
		return CityRepository.findById(id);
	}
	*/

	public void create(City city) {
		
		CityRepository.create(city);
	}
	
	public static void update() {
		CityRepository.update();
		
		City city = new City();
		city.getCity();
		city.getId();
		
	}
}

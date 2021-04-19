package org.la.student.tahir.jdbc.controller;


import java.util.List;


import org.la.student.tahir.jdbc.model.City;
//import org.la.student.tahir.jdbc.repository.CompanyRepository;
import org.la.student.tahir.jdbc.service.CityService;

public class CityController {
	
	City city = new City();
	CityService citService = new CityService();

	public static void main(String[] args) {
		
		CityController citControl = new CityController();
		
		citControl.addCity();
		//citControl.findById(1);
		citControl.findByCity("Yerwa");
		
	}

		
	
	void findById(int id) {
			System.out.println("----------findbyid city---------------");
			
			City city = citService.findById(id);
			if(city==null) {
				System.out.println("city not found");
			}
			else {
				System.out.println("City: "+city);
			}
		}
		
	void findByCity(String city) {
			
			System.out.println("----------findbyCity city---------------");
			
			List<City> cit = citService.findByCity(city);
			
			System.out.println(cit);
		}
		

		void addCity() {

			System.out.println("----------Adding city---------------");
			
			City city = new City();
			
			city.setCity("Yerwa");
			city.setId(2);
			
			citService.create(city);
			
		}
		

	

}

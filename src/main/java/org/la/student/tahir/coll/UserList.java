package org.la.student.tahir.coll;

import java.util.ArrayList;
import java.util.List;

import org.la.student.tahir.clas.City;

public class UserList {

	public static void main(String[] args) {


		List<City> city = new ArrayList<>();
		
		City city1 = new City("Nigeria", "Maiduguri");
		City city2 = new City("Rabat", "Morocco");
		City city3 = new City("Akra", "Ghana");
		City city4 = new City("Mumbai", "India");
		City city5 = new City("Putrajaya", "Malaysia");
		
		city.add(city1);
		city.add(city2);
		city.add(city3);
		city.add(city4);
		city.add(city5);
		
		for(int i=0; i<city.size(); i++) {
			
		//	City ci = city.get(i);
			System.out.println(i+" : "+ city.get(i).getCountry() + " " + city.get(i).getName());
		}
		System.out.println("CI");
		
		for(int i=0; i<city.size(); i++) {
			
				City ci = city.get(i);
				System.out.println(i+" : "+ ci.getCountry() + " " + ci.getName());
			}
			
		
		for(City cit: city ) {
		System.out.println(cit.getCountry() +" " + cit.getName());
		}
		
		
		
	}

}

package org.la.student.asif.coll;

import java.util.ArrayList;
import java.util.List;

import org.la.student.asif.clas.City;

public class UserList {

	public static void main(String[] args) {
		
		List<City> cityList = new ArrayList<>();
		
		
		City city1 = new City("kolkata", "India");
		City city2 = new City("Singapore", "Singapore");
		City city3 = new City("kuala lumpur", "Malaysia");
		City city4 = new City("Malbourne", "Australia");
		
		cityList.add(city1);
		cityList.add(city2);
		cityList.add(city3);
		cityList.add(city4);
		
		for(int i=0 ; i<cityList.size() ; i++) {
			System.out.println(i+" : "+cityList.get(i).getCountry().toUpperCase()+"   "+cityList.get(i).getName().toLowerCase());
		}
		
		for(int i=0 ; i<cityList.size() ; i++) {
			City city = cityList.get(i); 
		
			System.out.println(i+" : "+city.getCountry()+"   "+city.getName());
		}
		
		for(City city : cityList) {
			System.out.println(city.getCountry()+"   "+city.getName());
		}
	}
}

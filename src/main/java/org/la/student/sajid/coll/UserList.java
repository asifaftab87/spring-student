package org.la.student.sajid.coll;

import java.util.ArrayList;
import java.util.List;

import org.la.student.sajid.cls.City;

public class UserList {
	public static void main(String[] args) {
		List<City> cityList = new ArrayList<>();
		City city1 = new City("Bihar", "India");
		City city2 = new City("Kolkata", "India");
		City city3 = new City("Delhi", "India");
		City city4 = new City("Jaipur", "India");

		cityList.add(city1);
		cityList.add(city2);
		cityList.add(city3);
		cityList.add(city4);

		for (int i = 0; i < cityList.size(); i++) {
			System.out.println(i + " : " + cityList.get(i).getCountry().toUpperCase() + " " + cityList.get(i).getCityName().toLowerCase());
		}
		
		System.out.println();

		for (int i = 0; i < cityList.size(); i++) {
			City city = cityList.get(i);
			System.out.println(i + " : " + city.getCountry() + " " + city.getCityName());
		}
		System.out.println();
		
		for (City city:cityList) {
			System.out.println(city.getCountry() + " " + city.getCityName());
		}

	}

}

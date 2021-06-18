package org.la.student.noor;

public class CityMain {

	public static void main(String[] args) {
		City city= new City();
		city.setId(2);
		city.setCityId(411);

		int id= city.getId();
		int cityId=city.getCityId();

		System.out.println("Id: "+city.getId());
		System.out.println("City: "+city.getCityId());

	}
	}

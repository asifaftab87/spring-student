package org.la.student.barry.clas.task;

public class CityMain {

	public static void main(String[] args) {
		City city= new City();
		city.setId(11);
		city.setCityId(44);
		
		int id= city.getId();
		int cityId=city.getCityId();
		
		System.out.println("Id: "+id);
		System.out.println("City: "+cityId);
		
	}

}

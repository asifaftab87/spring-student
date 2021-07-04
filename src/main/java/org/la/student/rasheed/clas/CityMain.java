package org.la.student.rasheed.clas;

public class CityMain {

	public static void main(String[] args) {
		
		
		City city = new City();
		city.setcity("West California");
		city.setId(19092);
		
		
		String City = city.getcity();
		int Id = city.getId();
		
		
		
		System.out.println("City: "+City);
		System.out.println("ID: "+Id);
		

	}

}




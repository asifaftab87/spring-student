package org.la.student.asif.clas;

public class CityMain {

	public static void main(String[] args) {
		
		City city = new City("kolkata", "India");
		//city.show();
		
		City city2 = new City();
		city2.setName("jeddah");
		city2.setCountry("Saudi");
		city2.show();
		
		/*
		City city3 = new City();
		city3.setValues("dhaka", "bengladesh");
		city3.show();
		*/
	}
}

package org.la.student.bakil.objects;

public class CityMain {

	public static void main(String[] args) {
		
		
		City city = new City();
		
		city.setId(921663);
		city.setcityName("Kuala Lumpur");
		
		int id = city.getId();
		String cityName=city.getCity();
		
		System.out.println("Id :"+id +'\n'+"City name :"+cityName);

	}

}

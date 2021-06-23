package org.la.student.kayes.methods;

public class CityMain {

	public static void main(String[] args) {
		City city=new City();
		city.setId(700);
		city.setCity("KOLKATA");
		
		int id=city.getId();
		String cit=city.getCity();
		
		System.out.println("ID = "+id);
		System.out.println("City  =  "+cit);

	}

}

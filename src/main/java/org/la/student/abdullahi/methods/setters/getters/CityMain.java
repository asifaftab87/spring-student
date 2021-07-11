package org.la.student.abdullahi.methods.setters.getters;

public class CityMain {

	public static void main(String[]args) {
		
		City c = new City();
		c.setId(01);
		c.setCity("NewYork");
		
		int Id = c.getId();
		String City = c.getCity();
		
		System.out.println("ID = "+ Id);
		System.out.println("City = "+City);
		
		
	}
}
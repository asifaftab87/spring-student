package org.la.student.jamal.clas;

public class CityMain {

	public static void main(String[] args) {
		
		City city =new City();
		
		city.set(1573, "Lima");
		city.set(1245, "Cusco");
		
		city.display();
		
		
		int id=city.getId();
		String c= city.getCity();
		
		System.out.println("ID: "+id+" City: "+c);
		

	}

}
